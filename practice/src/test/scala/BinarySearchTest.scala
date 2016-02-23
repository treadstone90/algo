import codeforces.BinarySearch
import org.scalatest.{FlatSpec, Matchers}
import scala.collection.JavaConverters._
import scala.util.Random

/**
  * Created by karthik on 2/2/16.
  */
class BinarySearchTest extends FlatSpec with Matchers {
  "BINARY SEARCH" should "work" in {
    for (i <- 1 to 100) {
      val list = List.fill(100)(Random.nextInt())
      val numberIndex = Random.nextInt(list.size)
      BinarySearch.binarySearch(list.map(x => new Integer(x)).asJava, list(numberIndex)) should be (numberIndex)
    }
  }
}
