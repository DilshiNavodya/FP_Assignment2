import scala.io.StdIn._

object Addition extends App{

  def addition(n:Int):Int={

     if(n==0)
        0
     else
       n+addition(n-1)

  }
  println(addition(5))
}
