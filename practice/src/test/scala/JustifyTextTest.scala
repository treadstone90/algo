import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConverters._
/**
  * Created by karthik on 2/10/16.
  */
class JustifyTextTest extends FlatSpec with Matchers{
  "JustifyText" should "work" in {
    println(JustifyText.solution(Array("the", "cat" ,"climbed", "the", "clock"), 10).asScala.mkString("\n"))
    println(JustifyText.solution(Array("the", "cat" ,"climbed", "the", "clock"), 2).asScala.mkString("\n"))
    println(JustifyText.solution(Array("the", "cat" ,"climbed", "the", "clock"), 1).asScala.mkString("\n"))
    println(JustifyText.solution(Array("the"), 13).asScala.mkString("\n"))
    //println(JustifyText.solution(Array("the"),).asScala.mkString("\n"))
  }

}
