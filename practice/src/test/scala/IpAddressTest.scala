import org.scalatest.{Matchers, FlatSpec}
import scala.collection.JavaConverters._
/**
  * Created by karthik on 2/29/16.
  */
class IpAddressTest extends FlatSpec with Matchers {
  "THis" should "work" in {
    println(IpAddress.restoreIpAddresses("11"))
    println(IpAddress.restoreIpAddresses("25525511135"))
    println(IpAddress.restoreIpAddresses("0"))
    println(IpAddress.restoreIpAddresses("0000"))
    println(IpAddress.restoreIpAddresses("00000"))
    println(IpAddress.restoreIpAddresses("00000123"))
    println(IpAddress.restoreIpAddresses("111112"))
    println(IpAddress.restoreIpAddresses("11119802"))
    println(IpAddress.restoreIpAddresses("12341221123"))
  }
}
