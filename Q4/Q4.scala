import scala.io.StdIn._

object EvenOrOdd extends App{

  def EvnorOdd(n: Int) {
    if (n == 0){
      println("Even");
    }
    else if (n == 1){
      println("odd");
    }
    else return EvnorOdd(n-2);
  }
  print("Enter a Number : ")
  var n=readInt()
  EvnorOdd(n)
  }
