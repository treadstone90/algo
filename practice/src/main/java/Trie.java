/**
 * Created by karthik on 2/14/16.
 */
class TrieNode {
    // Initialize your data structure here.
    char c;
    TrieNode[] next;
    boolean hasEnd = false;
    public TrieNode(char c) {
        this.c = c;
        next = new TrieNode[27];
    }

    public TrieNode() {
        this.c = (char)-1;
        next = new TrieNode[27];
    }

    @Override
    public String toString() {
        return c + " next is" + next;
    }

    public boolean containsNext(char c) {
        return next[c-97] != null;
    }

    public TrieNode nodeAt(char c) {
        return next[c-97];
    }

    public TrieNode insertChar(char c) {
        next[c-97] = new TrieNode(c);
        return next[c-97];
    }

    public void setEnd() {
        hasEnd = true;
    }

    public boolean equalsChar(char c) {
        return this.c == c;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode temp = root;
        for(int i=0;i<word.length();i++) {
            TrieNode next = temp.nodeAt(word.charAt(i));
            if(next == null) {
                next = temp.insertChar(word.charAt(i));
            }
            temp = next;
        }
        temp.setEnd();
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode temp = root;
        for(int i=0;i<word.length();i++) {
            if(temp.containsNext(word.charAt(i))) {
                temp = temp.nodeAt(word.charAt(i));
            } else {
                return false;
            }
        }
        return temp.hasEnd;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(int i=0;i<prefix.length();i++) {
            if(temp.containsNext(prefix.charAt(i))) {
                temp = temp.nodeAt(prefix.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
