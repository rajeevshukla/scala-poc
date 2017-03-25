

object WhileLoopInScala {

  def main(args: Array[String]): Unit = {
    println("Implementing while loop in scala")
    	if(args.length>0){
				var i = 0;   //will be converted into Int as scala provide type inference feature
				while(i<args.length){
					println(args(i));
					i+=1;
				}
			}
  }

}