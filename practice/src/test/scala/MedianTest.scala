import org.scalatest.{Matchers, FlatSpec}

import scala.util.Random

/**
  * Created by karthik on 1/31/16.
  */
class MedianTest extends FlatSpec with Matchers {

  "Median" should "work" in {
    var i = 0
    while( i < 100) {
      val median = new OneStreamingMedian
      val array = Seq.fill(Random.nextInt(1000))(Random.nextInt(120000))
      println(array)
      val sorted = array.sorted
      array.foreach(median.add(_))
      val mid = array.length/2;
      if(!array.isEmpty && array.length % 2 == 0) {
        median.findMedian() should equal((sorted(mid) + sorted(mid-1))/2.0f)
      } else if(!array.isEmpty){
        median.findMedian() should equal(sorted(mid))
      }
      i += 1
    }
  }
}
