import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConverters._
/**
 * Created by karthik on 1/12/16.
 */
class DeleteArrayTest extends FlatSpec with Matchers {
  "DeleteArray" should "work" in {
    DeleteArray.deleteArray(Array(1,2,6,4,5,6), 6).toList.take(4) should be(Array(1,2,4,5))
    DeleteArray.deleteArray(Array(1,2), 1).toList.take(1) should be(Array(2))
    DeleteArray.deleteArray(Array(1,2, 2, 2, 1,1, 3,3,3,3), 1).toList.take(7) should be(Array(2, 2, 2, 3, 3, 3, 3))
    DeleteArray.deleteDuplicates(Array(1,2, 2, 2,3,3,3)).toList.take(3) should be(Array(1,2,3))
    DeleteArray.deleteDuplicates(Array(1,2, 2, 2,2,2)).toList.take(2) should be(Array(1,2))
    DeleteArray.deleteDuplicates(Array(1,2, 2, 2,2,2), 3).toList.take(4) should be(Array(1,2, 2, 2))
    DeleteArray.deleteDuplicates(Array(1,1, 1, 2,2), 3).toList.take(4) should be(Array(1,1,2,2))
    DeleteArray.deleteDuplicates(Array(1,1, 1, 2,2,2,3,4), 3).toList.take(6) should be(Array(1,1,2,2,3,4))
  }
}
