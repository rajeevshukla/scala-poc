package com.demo.builtincontrolstructures

import java.io.FileReader
import java.io.FileNotFoundException

object ExceptionHandling {
  def main(args: Array[String]):Unit= { 
 
    //findHalf(3)
    tryCatch
    println(finallyRules)
    
  }
  
 
  def findHalf (n :Int) = {
    
    if(n%2 == 0 )
      n/2
    else 
      throw new RuntimeException
  }
  
  
  def tryCatch() = {
    
    try {
      val file = new FileReader("abc.txt");
    }catch {
      case ex : FileNotFoundException => println("File not found"+ex.getMessage)
    }finally {
      println("Finally")
    }
  }
  

  def finallyRules():Int ={
    
    try {
      1 
    }
    finally {
      2
    // return   2 //if you use return statment in finally it will overrule all ohter values returned in prev 
        //blocks.
    }
  }
  
  
}