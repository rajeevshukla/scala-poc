package com.demo.functions

import scala.io.Source

object FunctionExample {
	def main(arg : Array[String]) { 
 
	  var numbers = List(1,2,3,4,5,6,-1,-3,-4);
	  
	 var filteredNumber =  numbers.filter((x:Int)=>x>0); //filter  first class function..
	 
	 println("Filtered numbers :  ")
	
	 filteredNumber.foreach(println)
	 //or filteredNumber.foreach(numbers.filter((x:Int)=>x>0)) in single line.
	 
	 
	 println("Printing all the elements using foreach first class function")
	 
	  numbers.foreach((x:Int)=>println(x)) // foreach using first class function 
	  
	 //syntax of using first class function 
	  // scala> var increase = (x: Int) => x + 1
	}
 
	//local functions


	def processFiles(fileName :String , width : Int) { 

		def processLines(fileName :String , line :String, width :Int) { 
			if(line.length>width)
				println(fileName +" :" + line)
		}

		val lines = Source.fromFile(fileName).getLines;
		for(line <- lines)
			processLines(fileName, line, width);

	}
	
	
}