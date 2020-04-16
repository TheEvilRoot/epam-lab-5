import org.scalatest.flatspec.AnyFlatSpec

class FibonacciTests extends AnyFlatSpec {

  "Find fibonacci number function" should "return list [0, 1, 1, 2] using tail recursion" in {
    assert(Fibonacci.findFibonacci(4, x => Fibonacci.fibonacci_tail(x)) ==
      List(0, 1, 1, 2))
  }

  it should "return list [0, 1, 1, 2] using common recursion" in {
    assert(Fibonacci.findFibonacci(4, Fibonacci.fibonacci) ==
      List(0, 1, 1, 2))
  }

  it should "return same lists" in {
    assert(Fibonacci.findFibonacci(6, Fibonacci.fibonacci) ==
      Fibonacci.findFibonacci(6, x => Fibonacci.fibonacci_tail(x)))
  }

  it should "return empty list with 0 passed" in {
    assert(Fibonacci.findFibonacci(0, Fibonacci.fibonacci) == List())
    assert(Fibonacci.findFibonacci(0, x => Fibonacci.fibonacci_tail(x)) == List())
  }

  it should "return empty list with negative count passed" in {
    assert(Fibonacci.findFibonacci(-2, Fibonacci.fibonacci) == List())
    assert(Fibonacci.findFibonacci(-2, x => Fibonacci.fibonacci_tail(x)) == List())
  }

  "Fibonacci function" should "return 55 as 10th fibonacci number" in {
    assert(Fibonacci.fibonacci(10) == 55)
    assert(Fibonacci.fibonacci_tail(10) == 55)
  }

}
