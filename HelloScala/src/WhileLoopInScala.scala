

class WhileLoopInScala {

	def main(args: Array[String]): Unit = {  //main method just like java, c, c++ 
			println("method signature in scala program");
			if(args.length>0){
				var i = 0;   //will be converted into Int as scala provide type inference feature
				while(i<args.length){
					print(args(i));
				}
			}
	} 

}