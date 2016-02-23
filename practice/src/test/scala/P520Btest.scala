import codeforces.P520B
import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by karthik on 1/26/16.
  */
class P520Btest extends FlatSpec with Matchers {
  "The BFS " should "work" in {
    P520B.solution(4, 6) should be (2)
    P520B.solution(10, 1) should be (9)
    P520B.solution(6, 3) should be (3)
    P520B.solution(99, 100) should be (50)
  }

}
