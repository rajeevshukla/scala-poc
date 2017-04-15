package com.demo.builtincontrolstructures

object BuiltInControlStructures {
	def main(arg : Array[String]) {

		val args = Array("abc.txt")
				// if retruning result
				val fileName = 
				if(!args.isEmpty) args(0) 
				else "default.txt"    // using val instead of var is a functional style of programming...
					println(fileName)
					// 
					println(if(args.nonEmpty) args(0) else "default.txt")


	}
}