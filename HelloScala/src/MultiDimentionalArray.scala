object MultiDimentionalArray {

	def main(args: Array[String]): Unit = {
			println("Working with multidiamentional array ");


			var matix = Array.ofDim[Int](2,2) // creating matrix of 2X2 
					matix(0)(0)=1;   
			matix(0)(1)=2;
			matix(1)(0)=3;
			matix(1)(1)=4;

			println("Matix data : ");
			for( i <- 0 to 1 ; j<-0 to 1){
				println(matix(i)(j))
			}


	}
}