import org.scalatest.{FlatSpec, Matchers}
import scala.collection.JavaConverters._
/**
  * Created by karthik on 2/8/16.
  */
class RotateArrayTest extends FlatSpec with Matchers {
  "rotate" should "work" in {
    println(RotateArray.solution(Array(1,2,3,4,9,10, 11), 2).toList)
    //10 9 3 4 2 1
    // 9 10 3 4 2 1
    // 9 10 1 2 3 4
    // 1 10 1 2 3 4
  }
}
