import codeforces.{P327A, P160A}
import org.scalatest.{Matchers, FlatSpec}

import scala.collection.mutable

/**
 * Created by karthik on 1/5/16.
 */
class P327ATest extends FlatSpec with Matchers{
  "p327A" should "correct" in {
    P327A.solution(1, Array(1)) should be (0)
    P327A.solution(1, Array(0)) should be (1)

    P327A.solution(2, Array(0, 0 )) should be (2)
    P327A.solution(1, Array(1,0)) should be (2)
    P327A.solution(5, Array(1,0,0,1,0)) should be (4)
    P327A.solution(4, Array(1,0,0,1)) should be (4)
    P327A.solution(4, Array(0,0,0,0)) should be (4)
    P327A.solution(4, Array(1,1,1,1)) should be (3)
    P327A.solution(100, Array(0,1,0,1,1,1,0,1,0,1,0,0,1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1,0,0,1,1,1,0,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1)) should be (70)
  }
}