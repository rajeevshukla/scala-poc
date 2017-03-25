

object MethodSignatureInScala {
  
   def main(args: Array[String]): Unit = {  //main method just like java, c, c++ 
       println("method signature in scala program");
  } 
 
    def method() = print("welcome")   //  another single line method syntax //return type Unit = void(in java)
    
    def method2() =  println("welcome2") ; // (semicolon optional)  //  another single line method signature.. //no equal
    
    def method3(x:Int, y:Int): Int = {    // parameterized method having method argument and return type as Int
      if(x>y) 
        return x
      else 
        return y
    }

    
    
}