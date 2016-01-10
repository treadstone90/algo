import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 1/9/16.
 */
class IntervalTest extends FlatSpec with Matchers {
  "isINtersect" should "work" in {
    IntervalStuff.isIntersect(new Interval(1, 5), new Interval(2, 6)) should be (true)
    IntervalStuff.isIntersect(new Interval(1, 2), new Interval(4, 6)) should be (false)
    IntervalStuff.isIntersect(new Interval(1, 8), new Interval(3, 5)) should be (true)
  }

  "Intersect" should "work" in {
    val a = IntervalStuff.intersect(new Interval(1, 8), new Interval(3, 5))
    val b = IntervalStuff.intersect(new Interval(1, 8), new Interval(3, 10))
    val c = IntervalStuff.intersect(new Interval(1, 8), new Interval(9, 10))

    a.start should be (3)
    a.end should be (5)

    b.start should be (3)
    b.end should be (8)

    c should be (null)

  }

  "Union" should "work" in {
    val a = IntervalStuff.union(new Interval(1, 8), new Interval(3, 5))
    val b = IntervalStuff.union(new Interval(1, 8), new Interval(3, 10))
    val c = IntervalStuff.union(new Interval(1, 8), new Interval(9, 10))

    a.start should be (1)
    a.end should be (8)

    b.start should be (1)
    b.end should be (10)

    c should be (null)

  }
}
