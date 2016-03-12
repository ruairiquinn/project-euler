import org.scalatest._

class Problem2Spec extends FlatSpec with Matchers {

  //  Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
  //  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  //  By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
  "Answer" should "be right" in {
    val `4million` = 4000000
    Problem2.sumOfEvenFibonacci(50, `4million`) shouldBe 4613732
  }
}

object Problem2 {
  def fib(n : Long) : Long = {
    def fibHelper(n:Long, a:Long, b:Long):Long = {
      if(n == 0) a
      else fibHelper(n - 1, b, a + b)
    }
    fibHelper(n, 0, 1)
  }

  def sumOfEvenFibonacci(threshold : Int, limit : Int) = {
    (1 until threshold).map(n => fib(n)).filter(n => n % 2 == 0 && n < limit).sum
  }
}
