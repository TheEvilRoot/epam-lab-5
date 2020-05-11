package com.theevilroot.epam.lab5.unit

import com.theevilroot.epam.lab5.Fibonacci
import org.scalatest.flatspec.AnyFlatSpec

class FibonacciTests extends AnyFlatSpec {

  "fibonacci function" should "return list [0, 1, 1, 2] using tail recursion" in {
    assert(Fibonacci.fibonacci(4, Fibonacci.nth_fibonacci_tail) ==
      List(0, 1, 1, 2))
  }

  it should "return list [0, 1, 1, 2] using common recursion" in {
    assert(Fibonacci.fibonacci(4, Fibonacci.nth_fibonacci) ==
      List(0, 1, 1, 2))
  }

  it should "return same lists" in {
    assert(Fibonacci.fibonacci(6, Fibonacci.nth_fibonacci) ==
      Fibonacci.fibonacci(6, Fibonacci.nth_fibonacci_tail))
  }

  it should "return empty list with 0 passed" in {
    assert(Fibonacci.fibonacci(0, Fibonacci.nth_fibonacci) == List())
    assert(Fibonacci.fibonacci(0, Fibonacci.nth_fibonacci_tail) == List())
  }

  it should "return empty list with negative count passed" in {
    assert(Fibonacci.fibonacci(-2, Fibonacci.nth_fibonacci) == List())
    assert(Fibonacci.fibonacci(-2, Fibonacci.nth_fibonacci_tail) == List())
  }

  "nth_fibonacci" should "return 55 as 10th fibonacci number" in {
    assert(Fibonacci.nth_fibonacci(10) == 55)
    assert(Fibonacci.nth_fibonacci_tail(10) == 55)
  }

}
