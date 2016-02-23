import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 1/13/16.
 */
class MaxDifferenceTest extends FlatSpec with Matchers {
  "MaxDifference" should "work" in {
    MaxDifference.maxDifference(Array(1,2,3,77,9)) should be (76)
    MaxDifference.maxDifference(Array(1,10)) should be (9)
    MaxDifference.maxDifference(Array(1, 10, 14, 16, 20)) should be (19)
    MaxDifference.maxDifference(Array(1, 10, 14, 16, 20, 0, 100)) should be (100)
    MaxDifference.maxFlatLine(Array(1, 10, 14, 16, 20, 0, 100)) should be (1)
    MaxDifference.maxFlatLine(Array(1, 10,10,10, 14,14)) should be (3)
    MaxDifference.maxFlatLine(Array(1, 10,10,10, 14,14,14,14)) should be (4)
    MaxDifference.maxFlatLine(Array(1)) should be (1)
    MaxDifference.maxFlatLine(Array(1,1,1,1,1)) should be (5)
  }

}
