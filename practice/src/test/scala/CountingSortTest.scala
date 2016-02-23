import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 1/10/16.
 */
class CountingSortTest extends FlatSpec with Matchers {
  "Counting sort" should "work" in {
    val a = Array(5,3,2,4,5,2,1)

    CountingSort.sort(a)

    println(a.toList)
  }
}
