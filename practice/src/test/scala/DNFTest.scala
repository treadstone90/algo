import org.scalatest._
import scala.concurrent.JavaConversions._
/**
 * Created by karthik on 7/19/15.
 */

class InterviewTest extends FlatSpec with Matchers {

  val dnf = new DNF()

//  "DNF" should "work on randomized inputs" in {
//    (1 to 100).foreach { i =>
//      val a = randomArray(100, 2)
//      dnf.dutchNationalFlag(a) should be(a.sorted)
//    }
//  }

//  "Slidingmax test" should "work" in {
//    val s = new SlidingMax();
//    val ans = s.maxSlidingWindow(Array(4,3,2,1,0,10,11,12,14), 5)
//    println(ans.toList)
//  }

  "Largest Number " should "work" in {
    val s = new LargestNumber();
    val ans = s.largestNumber(Array(0,0, 0, 9))
    println(ans)
  }

  def randomArray(n: Int, range: Int): Array[Int] = {
    var a:Array[Int] = new Array[Int](n)
    for (index <- 0 to a.length - 1) a(index) = (randInt(range))
    a
  }
  def randInt(range: Int): Int = {
    val rnd = new scala.util.Random
    rnd.nextInt(range)
  }
}
