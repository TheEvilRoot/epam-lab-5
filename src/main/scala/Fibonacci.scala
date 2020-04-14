import scala.annotation.tailrec

object Fibonacci {
  @tailrec
  def fibonacci_tail(n: Int, a: Int = 0, b: Int = 1): Int = n match {
    case 0 => a
    case _ => fibonacci_tail(n - 1, b, a + b)
  }

  def fibonacci(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  @tailrec
  def findFibonacci(count: Int, fibFunc: Int => Int, size: Int = 0, numbers: List[Int] = List()): List[Int] = size match {
    case _ if size < count => findFibonacci(count, fibFunc, size + 1, numbers.appended(fibFunc(size)))
    case _ => numbers
  }
}
