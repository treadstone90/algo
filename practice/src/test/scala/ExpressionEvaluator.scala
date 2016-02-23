import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConverters._

/**
  * Created by karthik on 2/22/16.
  */
class ExpressionEvaluatorTest extends FlatSpec with Matchers {
  "This" should "work" in {
    ExpressionEvaluator.computeExpression("1+2*3").asScala.toSet should be (Set(7, 9))
    println(ExpressionEvaluator.computeExpression("1*2+3*4").asScala.toSet)
    println(ExpressionEvaluator.computeExpression("1/2*3+5").asScala.toSet)
  }

}
