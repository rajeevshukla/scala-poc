package com.demo.functions

import scala.io.Source

object FunctionExample {
	def main(arg : Array[String]) { 

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