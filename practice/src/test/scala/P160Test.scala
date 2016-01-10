import codeforces.{P160A, P112A}
import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConverters._
import scala.collection.mutable

/**
 * Created by karthik on 12/26/15.
 */
class P160ATest extends FlatSpec with Matchers {
  "p160ATest" should "correct" in {
    P160A.solution(2, mutable.MutableList(3, 3).map(int2Integer).asJava) should be (2)
    P160A.solution(3, mutable.MutableList(2, 1, 2).map(int2Integer).asJava) should be (2)
    P160A.solution(1, mutable.MutableList(1).map(int2Integer).asJava) should be (1)
    P160A.solution(4, mutable.MutableList(4,3,2,1).map(int2Integer).asJava) should be (2)
  }
}

