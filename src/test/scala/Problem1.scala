import org.scalatest._

class Problem1Spec extends FlatSpec with Matchers {

  //   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  //   Find the sum of all the multiples of 3 or 5 below 1000.
  "Answer" should "be right" in {
    Problem1.sumOfMultiplesOf3or5(10) shouldBe 23
    Problem1.sumOfMultiplesOf3or5(1000) shouldBe 233168
  }
}

object Problem1 {
  def sumOfMultiplesOf3or5(threshold : Int) = {
    (1 until threshold).filter(n => n % 3 == 0 || n % 5 == 0).sum
  }
}