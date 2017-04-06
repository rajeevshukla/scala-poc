import scala.io.Source


package object ReadingFromFile {
  
  def main(args : Array[String]): Unit = {
     //reading file content, where file name is being passed from command line. 
    if(args.length>0){
     println("Printing file content : "+ args(0)) 
      for(line <-Source.fromFile(args(0)).getLines){
        println(line)
      }
      
    }
  }
}