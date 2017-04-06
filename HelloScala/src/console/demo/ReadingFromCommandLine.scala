

package console.demo

import scala.io.StdIn

object ReadingFromCommandLine {

	def main(args: Array[String]){

		println("Enter any text")
		var line = StdIn.readLine()
		println("You entered:" + line);

	}
}