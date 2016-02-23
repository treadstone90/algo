import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by karthik on 2/20/16.
  */
class MinWindowStringtest extends FlatSpec with Matchers {
  "minindow" should "work" in {
    MinWindowString.minWindow("a", "aa") should be ("a")
    MinWindowString.minWindow("aafggg", "af") should be ("af")
    MinWindowString.minWindow("adobebanc", "abc") should be ("banc")
    MinWindowString.minWindow("aafggg", "rrt") should be ("")

  }
}
