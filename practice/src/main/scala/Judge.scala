import scala.collection.JavaConverters

/**
 * Created by karthik on 7/19/15.
 */
object Judge {
  def main(args: Array[String]) = {
    val dnf = new DNF()
    println(dnf.dutchNationalFlag(Array(2,1,0,0,0,0,0,0,0)).toList)
    println(dnf.dutchNationalFlag(Array(2,1)).toList)
    println(dnf.dutchNationalFlag(Array(2,0,0,0)).toList)
    println(dnf.dutchNationalFlag(Array(2,1,0,2,0,1)).toList)
  }
}
