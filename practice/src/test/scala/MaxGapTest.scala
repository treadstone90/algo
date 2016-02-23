import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 1/11/16.
 */
class MaxGapTest extends FlatSpec with Matchers {
  "MaxGap" should "correct" in {
    MaxGap.maximumGap(Array(9, 6, 1, 4)) should be (3)
    MaxGap.maximumGap(Array(1, 15, 50, 75, 100)) should be (35)
    MaxGap.maximumGap(Array(1, 2)) should be (1)
    MaxGap.maximumGap(Array(1, 12)) should be (11)
    MaxGap.maximumGap(Array(1, 1, 1, 1, 4)) should be (3)
  }

}
