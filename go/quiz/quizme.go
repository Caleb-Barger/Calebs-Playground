package main

import (
  "fmt"
  "flag"
  "io/ioutil"
  "gopkg.in/yaml.v2"
)

type Config struct {
    Foo string[]
}

func main() {
  fmt.Println("Parsing YAML")
  var fileName string
  flag.StringVar(&fileName, "f", "", "YAML file to parse")
  flag.Parse()

  if fileName == "" {
    fmt.Println("Please Provide a file using -f option")
    return
  }

  yamlFile, err := ioutil.ReadFile(fileName)
  if err != nil {
    fmt.Printf("Error reading YAML file: %s\n", err)
    return
  }

  var yamlConfig Config
  err = yaml.Unmarshal(yamlFile, &yamlConfig)
  if err != nil {
    fmt.Printf("Error parsing YAML file: %s\n", err)
  }

  fmt.Printf("Result: %v\n", yamlConfig)
}
