package main

import (
  "fmt"
  "gopkg.in/yaml.v2"
)

var data2 = `
  questions:
    d: [3,4]
`

var data = `
  questions:
    - caleb:barger
    - age:18
`

type T struct {
  Questions struct {
    D []map[string]string `yaml:",flow"`
  }
}

func main() {
  t := T{}
  err := yaml.Unmarshal([]byte(data), &t)
  if err != nil {
    panic(err)
  }
  fmt.Printf("---t:\n%v\n\n", t)
}
