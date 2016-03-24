import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by karthik on 3/6/16.
  */
class OperatorComboTest extends FlatSpec with Matchers{
  val sut = new OperatorCombo
  "Opeator Combo" should "work" in {
    println(sut.addOperators("0", 0))
    println(sut.addOperators("01", 0))
    println(sut.addOperators("01", 1))
    println(sut.addOperators("00",0))
    println(sut.addOperators("0011222",2))
  }
}
