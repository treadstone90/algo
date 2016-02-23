import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by karthik on 2/16/16.
  */
class RegexTest extends FlatSpec with Matchers {
  "Regex Test" should "work" in {
    RegexMatch.isMatch("a", "a") should be (true)
    RegexMatch.isMatch("abcd", "abcd") should be (true)
    RegexMatch.isMatch("aabcd", "a*d") should be (true)
    RegexMatch.isMatch("aabcd", "a?d") should be (false)

    RegexMatch.isMatch("aabcd", "a*a*b*c*d*") should be (true)

    RegexMatch.isMatch("aadcd", "*de") should be (false)
  }
}
