

object WorkingWithArray {
  
 
  def main(args: Array[String]): Unit = {
    println("Welcome to array implementation");
    var array = new Array[String](4);
    
    array(0)="Hello";
    array(1)="My";
    array(2)="Name";
    array(3)=" Is Rajeev Shukla";
    
    
    array.foreach(s=>println(s));
   //  array.foreach(println);  another way to implement above statement.
    
    println("Another version of foreach");
    array.foreach((s:String)=>println(s));
    
    //another version of for loop in scala. 
    for(s<-array){
      println(s);
    }
    
    //another version of for loop
    for ( i <- 0 to 2 ) 
      println(array(i));
    
    		val arrray2 = Array("one","two","three")
  }
  
  
  
  
}