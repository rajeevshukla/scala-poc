


/** Touples are immutable and can contains different type of elements*/

 object WorkingWithTouple { 
   
   def main(args:Array[String]):Unit= {
     
    var pair =(9,"Welcome to touple program",3);
    
    println(pair._1)
    println(pair._2)
    println(pair.hashCode())
   }
   
   
 }