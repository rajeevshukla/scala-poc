package com.demo.builtincontrolstructures

object MatchExpressions {
  def main(args : Array[String]) { 
    
    var arg ="scala";
    val result =  arg match {
      case "scala" => println("scala found")
      case "java"=> println("java found")
      case "c++"=> { 
        println("c++ found in curly bracket")
      }
      case _  => println("printing default as no match found")
    }
    
    println(result) //Unit () will be printed since no value is being returned. 
    
    
  }
}