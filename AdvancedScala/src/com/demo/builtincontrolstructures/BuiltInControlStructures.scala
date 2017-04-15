package com.demo.builtincontrolstructures

import scala.io.StdIn

object BuiltInControlStructures {
	def main(arg : Array[String]) {


		//calling method 
		implmentingIf
    implementingDoWhile 
    
    println("Enter two numbers to calculate gcd")
    val x = StdIn.readLong()
    var y = StdIn.readLong()
    println("GCD : " + gcd(x, y));


	}

	def implmentingIf() = { 
			val args = Array("abc.txt")
					// if retruning result
					val fileName = 
					if(!args.isEmpty) args(0) 
					else "default.txt"    // using val instead of var is a functional style of programming...
						println(fileName)
						// 
						println(if(args.nonEmpty) args(0) else "default.txt")
	}


	//calculating GCD using while loop.
	def gcd (x:Long, y:Long): Long=   { 
			    var a = x
					var b = y
					while(a !=0) {  // do while never returns interesting results in return. you must have to do that manually. 
						val temp = a
								a = b % a
								b = temp
					}
			b

	}


	def implementingDoWhile() = { 
	  println("Enter line to read : ")
	  var line =""
	  do {
	    line = StdIn.readLine()
	    println("Line :" + line)
	  } while(line != "")
	  
	}


	def implementingFor() = { 

	}


	def implementingForAsAFilter() = { 


	}

}