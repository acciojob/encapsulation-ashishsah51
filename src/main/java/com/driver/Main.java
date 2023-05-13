package com.driver;

public class Main {
  // Main method
    public static void main(String[] args) {
      RWOnly obj = new RWOnly();
      //   obj.name = "Ashish";
      obj.setName("Ashish");
      System.out.println(obj.getName());
    }
}