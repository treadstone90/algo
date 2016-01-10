import scala.annotation.tailrec
import scala.collection.mutable

/**
 * Created by karthik on 9/26/15.
 */

case class TreeNode(left: Option[TreeNode], right: Option[TreeNode], data: Int)


class TreeOperations {

  def inorderSuccessor(root: TreeNode, targetNode: TreeNode): TreeNode = {
    val stack = new mutable.Stack[TreeNode]()

    var traverse:Option[TreeNode] = Some(root)

    while(traverse.isDefined && traverse.get.data != targetNode.data) {
      stack.push(traverse.get)
      if(traverse.get.data < targetNode.data) {
        traverse = traverse.get.right
      } else {
        traverse = traverse.get.left
      }
    }

    if(traverse.isDefined) {
      if(traverse.get.right.isDefined) {
        return findLeftMost(traverse.get.right.get)
      } else {
        var bottomUpTraverse: TreeNode = traverse.get

        while(bottomUpTraverse != root) {
          val parent = stack.pop()
          if(parent.left == bottomUpTraverse) {
            return parent
          } else {
            bottomUpTraverse = parent
          }
        }
        return bottomUpTraverse
      }
    } else {
      throw new RuntimeException("target element node found")
    }
  }

  @tailrec
  final def findLeftMost(node: TreeNode): TreeNode = {
    if(node.left.isEmpty) {
      return node
    } else {
      return findLeftMost(node)
    }
  }
}