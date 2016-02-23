import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by karthik on 1/12/16.
 */
class ArrayWalkTest extends FlatSpec with Matchers {
  "ArrayWalk" should "work" in {
    WalkArray.arrayWalk(Array(2,1,2,1,0,1)) should be (-1)
    WalkArray.arrayWalk(Array(2,1,3,1,0,1)) should be (2)
    WalkArray.arrayWalk(Array(1,1)) should be (1)
    WalkArray.arrayWalk(Array(0,0)) should be (-1)
    WalkArray.arrayWalk(Array(0,0)) should be (-1)
    WalkArray.arrayWalk(Array(3,3,0,2)) should be (1)
    WalkArray.arrayWalk(Array(3,3,0,2,0,3,1,0,1)) should be (3)
  }
}
