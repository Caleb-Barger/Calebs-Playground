package main

import (
  "fmt"
  "net/http"
  "strings"
)

func main() {
  http.HandleFunc("/hello", hello)
  http.HandleFunc("/goodbye", goodbye)
//  http.HandleFunc("/", homepage)
  http.ListenAndServe(":8080", http.FileServer(http.Dir("/usr/share/doc")))
}

func hello(res http.ResponseWriter, req *http.Request) {
  query := req.URL.Query()
  name := query.Get("name")
  if name == "" {
    name = "Caleb"
  }

  fmt.Fprint(res, "Hello, my name is ", name)
}

func goodbye(res http.ResponseWriter, req *http.Request) {
  path := req.URL.Path
  parts := strings.Split(path, "/")
  name := parts[2]
  if name == "" {
    name = "Caleb Barger"
  }
  fmt.Fprint(res, "Goodbye ", name)
}
