import scala.io.StdIn._
import scala.util.control.Breaks.break

object Fibo extends App{
  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      println(nextToLast + " ")
      if(i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }
  print("Enter a Number : ")
  var n=readInt()
  println(fibonacci(n))
}
