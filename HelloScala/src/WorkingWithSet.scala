import scala.collection.immutable.Set
import scala.collection.immutable.HashSet


object WorkingWithSet {
  def main(args : Array[String]):Unit = {
    println("welcome to the collection world");
    
    var set = Set("abc","pqer"); //by default mutable Set 
    println(set)
    set += "123"; //adding 
    
    println(set)
    
    HashSet
    scala.collection.mutable.HashSet
    
  }
}