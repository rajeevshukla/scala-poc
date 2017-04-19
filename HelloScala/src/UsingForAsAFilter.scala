

object UsingForAsAFilter {
  
  def main(args :Array[String]) { 
    
    var evenList = for { i <- 0 to 30 
      if i%2==0 } yield i  //acting as a filter and yielding only i
      for(i<-evenList)
        println(i)
    
  }
}