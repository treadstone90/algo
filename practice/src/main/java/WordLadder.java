import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by karthik on 8/10/15.
 */
public class WordLadder {
    List<List<String>> answer = new ArrayList<List<String>>();
    Set<String> visited = new HashSet<String>();

    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<String> init = new ArrayList<String>();
        init.add(start);
        dfs(start, end, dict, init);
        visited.clear();
        List<List<String>> temp = answer;
        answer = null;
        return temp;
    }

    private void dfs(String node, String end, Set<String> dict, List<String> ans) {
        if(isOneHamming(node, end)) {
            ans.add(end);
            if(answer.isEmpty()) {
                answer.add(new ArrayList<String>(ans));
            } else {
                List<String> t = answer.get(answer.size() -1);
                if(ans.size() < t.size()) {
                    answer.clear();
                    answer.add(t);
                } else if(ans.size() == t.size()) {
                    answer.add(t);
                }
            }
            return ;
        }

        visited.add(node);
        for(String word: dict) {
            if(!visited.contains(word) && isOneHamming(node, word)) {
                if(answer.isEmpty() || (answer.get(answer.size() -1).size() >= ans.size()))
                ans.add(word);
                dfs(word, end, dict, ans);
                ans.remove(word);
            }
        }
        visited.remove(node);
    }

    private boolean isOneHamming(String w1, String w2) {
        if(w1.length() != w2.length()) {
            return false;
        } else {
            int diffCount =0;
            for(int i=0;i<w1.length();i++) {
                if(w1.charAt(i) != w2.charAt(i)) {
                    diffCount++;
                }
                if(diffCount > 1){
                    return false;
                }
            }
            return true;
        }
    }
}
