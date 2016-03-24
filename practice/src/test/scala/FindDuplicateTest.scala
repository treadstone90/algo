import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by karthik on 3/20/16.
  */
class FindDuplicateTest extends FlatSpec with Matchers {
  "Duplicate " should "work" in {
    FindDuplicate.solution(Array(1, 1, 2)) should be(1)
    FindDuplicate.solution(Array(1, 2, 2)) should be(2)
    FindDuplicate.solution(Array(1, 2, 3,3)) should be(3)
    FindDuplicate.solution(Array(3,1,3,2)) should be(3)
    FindDuplicate.solution(Array(1,1,1,1)) should be(1)
    FindDuplicate.solution(Array(3,3,3,3)) should be(3)
  }

}
