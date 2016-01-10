import codeforces.P580A
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 1/5/16.
 */
class P580ATest extends FlatSpec with Matchers {
  "p580a" should "correct" in {
    P580A.solution(6, Array(2,2,1,3,4,1)) should be (3)
    P580A.solution(1, Array(1,1,1,1)) should be (4)
    P580A.solution(1, Array(1,1,0,0,0)) should be (3)
  }
}
