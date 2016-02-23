import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 1/14/16.
 */
class SearchesTest extends FlatSpec with Matchers {
  "findLocalMInial" should "work" in {
    Searches.findLocalMinima(Array(15, 13, 12, 18, 19, 20, 7, 6, 5, 4, 3, 2, 11)) should be (11)
    Searches.findLocalMinima(Array(15, 13, 13, 11, 2, 11)) should be (11)
  }

}
