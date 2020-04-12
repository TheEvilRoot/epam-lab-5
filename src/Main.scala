import scala.annotation.tailrec
import scala.io.StdIn

object Main {

  @tailrec
  def fibonacci_tail(n: Int, a: Int = 0, b: Int = 1): Int = n match {
    case 0 => a
    case _ => fibonacci_tail(n - 1, b, a + b)
  }

  def fibonacci(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def findFibonacci(count: Int): Unit = {
    if (count <= 0) {
      println("Count must be positive and greater than 0")
    } else {
      println("With tail recursion: ")
      for (x <- 0 to count) println(fibonacci_tail(x))
      println("Without tail recursion")
      for (x <- 0 to count) println(fibonacci(x))
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter number of fibonacci: ")
    try {
      findFibonacci(StdIn.readInt())
    } catch {
      case _: NumberFormatException => println("Invalid number")
      case _: Throwable => println("Error occurred")
    }
  }

}
