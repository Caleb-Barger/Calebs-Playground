package main

import (
  "fmt"
  "sync"
)

var wg sync.WaitGroup
wg.add(1)

type Model struct {
  Data []map[string]string
}

func (m *Model) initModel(l int) {
  m.Data = make([]map[string]string, l)
  wg.Done()

}

func main() {
  myMap := make(map[string]string)
//    myArr := make([]int, 50)
  myMap["Caleb"] = "Barger"
  myMap["Kevin"] = "Finnegan"
  fmt.Println(myMap)
  m := Model{}
  m.initModel(1)
  wg.Done()
  m.Data[0]["Caleb"] = "Barger"
  fmt.Println(m.Data)
}
