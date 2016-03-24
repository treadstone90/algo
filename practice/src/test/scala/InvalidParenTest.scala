import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by karthik on 2/28/16.
  */
class InvalidParenTest extends FlatSpec with Matchers {

  "invalid" should "work" in {
    println(RemoveParent.removeInvalidParentheses("(())())"))
  }

}
