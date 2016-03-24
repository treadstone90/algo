import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConverters._

/**
  * Created by karthik on 2/28/16.
  */
class CombinationsTest extends FlatSpec with Matchers {
  val sut = new Combinations
  val sut2 = new Combinations2


  "Combinations2" should "wrok" in {
    println(sut2.combine(9, 3))
  }
}
