import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by karthik on 2/14/16.
  */
class TrieTest extends FlatSpec with Matchers {

  "Trie" should "work" in {
    val trie = new Trie()

    trie.insert("karthik")
    trie.insert("kar")
    trie.insert("kara")

    trie.insert("a")
    trie.insert("v")
    trie.insert("v")

    trie.search("karthik") should be (true)
    trie.search("kar") should be (true)
    trie.search("kara") should be (true)
    trie.search("kart") should be (false)
    trie.search("karh") should be (false)
    trie.search("karthi") should be (false)

    trie.startsWith("karthik") should be (true)
    trie.startsWith("kar") should be (true)
    trie.startsWith("kart") should be (true)
    trie.startsWith("karthi") should be (true)

    trie.startsWith("a") should be (true)
    trie.startsWith("v") should be (true)
  }
}
