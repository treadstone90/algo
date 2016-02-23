import codeforces.SubstringWithUniqe
import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by karthik on 2/22/16.
  */
class SubstringWithUniqeTest extends FlatSpec with Matchers {
  "unique" should "work" in {
    SubstringWithUniqe.solution("abbbbb", 1) should be ("bbbbb")
    SubstringWithUniqe.solution("abbbbbccc", 2) should be ("bbbbbccc")
    SubstringWithUniqe.solution("aabbcc", 3) should be ("aabbcc")
    SubstringWithUniqe.solution("aabb", 3) should be ("")
    SubstringWithUniqe.solution("aabacbebe", 3) should be ("aabacb")
  }

}
