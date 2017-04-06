package classes.scala

import scala.io.StdIn

class ChecksumAccumulator {

	private var sum = 0;

	def add(b: Byte) = sum += b

			def checksum(): Int = ~(sum & 0xFF) + 1

}

object ChecksumAccumulator {  // if the class name and singlton object name are same and they are defined in the same source file 
	// then the object is called companion object. 

	var cache = Map[String,Int]()

			def calculate(s:String)={
					if(cache.contains(s)){
						cache.get(s);
					}else {
						var checkSome = new ChecksumAccumulator

								for(c<-s)
									checkSome.add(c.toByte);
									val sum =checkSome.checksum();
                  cache +=(s->sum)
                  println("sum="+sum)
                  sum //returning sum as 
					}
	}

	def main(args: Array[String]) {
		println("Enter the string for which you want to accumulate checksum :")
		
		println(calculate(StdIn.readLine()))
			
	}
}