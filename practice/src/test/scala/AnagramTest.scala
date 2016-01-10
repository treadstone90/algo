import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConversions._
/**
 * Created by karthik on 8/9/15.
 */
class Anagramtest extends FlatSpec with Matchers {
  //val o = new Anagram()
  val p = new WordLadder()

//  "anagram" should "be true" in {
//    o.isAnagram("car", "rac") should be (true)
//    o.isAnagram("car", "car") should be (true)
//    o.isAnagram("aaaa", "aaaa") should be (true)
//    o.isAnagram("", "") should be (true)
//  }
//
//  "anagram" should "be false " in {
//    o.isAnagram("car", "rrac") should be (false)
//    o.isAnagram("car", "aaaa") should be (false)
//    o.isAnagram("aaaa", "aaaaxzzzzz") should be (false)
//    o.isAnagram("aaaa", "") should be (false)
//  }

  "wl" should "work" in {
    p.findLadders("cog", "hit", Set("hot","dot","dog","lot","log"));
  }
}
