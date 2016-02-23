import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 1/16/16.
 */
class HashTablesTest extends FlatSpec with Matchers {
  "Longest distinct" should "work" in {
    HashTables.longestDistinctArray(Array(1)) should be (1)
    HashTables.longestDistinctArray(Array(1, 2)) should be (2)
    HashTables.longestDistinctArray(Array(1, 2, 1, 3, 4, 5, 3, 100, 4, 3)) should be (5)

    HashTables.longestContainedInterval(Array(1,2,3,233,355,67,7,8,9,10)) should be (4)
    HashTables.longestContainedInterval(Array(1,2,3,233,355,67,4,5,9,10)) should be (5)
    HashTables.longestContainedInterval(Array(1,1,1,1,2,2,2,4,4,4)) should be (2)
    HashTables.longestContainedInterval(Array(1,2,3,4,5,6,7)) should be (7)
    HashTables.longestContainedInterval(Array(1)) should be (1)
  }
}
