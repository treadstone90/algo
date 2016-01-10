import scala.collection.mutable

/**
 * Created by karthik on 9/26/15.
 */
object Solutions {
  def deDupeString(input: String) = {
    val stack = new mutable.Stack[Char]()
    var indexMap = Map[Char, Int]()
    var seen = Set[Char]()

    (0 to input.length - 1).foreach{ index =>
      indexMap = indexMap.updated(input(index), index)
    }

    (0 to input.length - 1).foreach{ index =>
      if(stack.isEmpty) {
        stack.push(input(index))
        seen = seen + input(index)
      } else if(!seen(input(index)) && stack.head < input(index)){
        stack.push(input(index))
        seen = seen + input(index)
      } else if(!seen(input(index)) && stack.head == input(index)) {

      } else {
        while(stack.nonEmpty && indexMap(stack.head) > index) {
          stack.pop()
        }
        stack.push(input(index))
        seen = seen + input(index)
      }
    }

    stack.toString()
  }

}
