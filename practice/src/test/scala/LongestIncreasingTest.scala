import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConverters._

/**
  * Created by karthik on 2/7/16.
  */
class LongestIncreasingTest extends FlatSpec with Matchers {
  "LIS" should "work" in {
    val ans = LongestIncreasingSubarray.solution(List(1,2,3,4).map(Int.box).asJava)
    ans.a should be (0)
    ans.b should be (3)

    val ans1 = LongestIncreasingSubarray.solution(List(1,2,3,4, -1, 0, 1, 2, 3, 5).map(Int.box).asJava)
    ans1.a should be (4)
    ans1.b should be (9)

    val ans2 = LongestIncreasingSubarray.solution(List(10,9,8).map(Int.box).asJava)
    ans2.a should be (0)
    ans2.b should be (0)

    val ans3 = LongestIncreasingSubarray.solution(List(2,11,3,5,13,7,19,17,23).map(Int.box).asJava)
    ans3.a should be (2)
    ans3.b should be (4)
  }
}
