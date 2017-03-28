

object WorkingWithNameArgument {
  
 def main(args:Array[String]):Unit = { 
   
   printDetails("Rajeev", "Shukla");
   printDetails(fName="Rajeev", lName="Shukla");
   printDetails(lName="Shukla", fName="Rajeev"); //benefit , change the order of argument
   
 }
 
 def printDetails(fName:String,lName:String){
   
   println("fName : "+ fName+" lName :"+lName);
 }
  
}

/*output : 

fName : Rajeev lName :Shukla
fName : Rajeev lName :Shukla
fName : Rajeev lName :Shukla

 */
