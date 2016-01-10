import codeforces.P112A
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 12/26/15.
 */
class P112ATest extends FlatSpec with Matchers {
  "1. CompareString" should "return 0" in {
    P112A.solution("aaaa", "aaaA") should be ("0")
  }

  "2. CompareString" should "return 1" in {
    P112A.solution("abs", "abZ") should be ("-1")
  }

  "3. CompareString" should "return -1" in {
    P112A.solution("abcdefg", "AbCdEfF") should be ("1")
  }

  "4. CompareString" should "return 1" in {
    P112A.solution("Z", "A") should be ("1")
  }
}
