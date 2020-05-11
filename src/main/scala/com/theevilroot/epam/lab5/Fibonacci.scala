package com.theevilroot.epam.lab5

import scala.annotation.tailrec

object Fibonacci {

  @tailrec
  def fibonacci_tail(a: Int, b: Int)(n: Int): Int = n match {
      case 0 => a
      case _ => fibonacci_tail(b, a + b)(n - 1)
    }

  def nth_fibonacci_tail: Int => Int = fibonacci_tail(0, 1)

  def nth_fibonacci(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => nth_fibonacci(n - 1) + nth_fibonacci(n - 2)
  }

  def fibonacci(n: Int, f: Int => Int): List[Int] = n match {
    case a if a <= 0 => List()
    case a => fibonacci(a - 1, f).appended(f(n - 1))
  }

}
