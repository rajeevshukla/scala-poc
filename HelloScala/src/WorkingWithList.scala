

object WorkingWithList {
	def main(args: Array[String]): Unit = {
			val list = List("Wait","until" ,"I", "learn", "scala");
			println("elements containing leght of 5 is :"+ list.count(s=>s.length()==5)); 
			println("Reversed list is : "+list.reverse);
			println(list.exists(s=>s.endsWith("t")))
			println("First 3 element of the list: "+list.take(3))
			println("First element"+ list(0));
			println(list.map(s=>s+"y")) //appending "y" in each elements in the list 
	}
}