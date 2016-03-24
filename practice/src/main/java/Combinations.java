import java.util.ArrayList;
import java.util.List;

/**
 * Created by karthik on 2/28/16.
 */
public class Combinations {
    List<List<Integer>> solution = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        solution.clear();
        for(int i=1;i<=n;i++) {
            helper(i, k, new ArrayList<>(), n);
        }
        return solution;
    }

    public void helper(int startFrom, int remainingSpots, List<Integer> current, int n) {
        if(remainingSpots == 1) {
            List<Integer> ans = new ArrayList<>();
            current.add(startFrom);
            ans.addAll(current);
            current.remove(current.size()-1);
            solution.add(ans);
            return;
        } else {
            current.add(startFrom);
            for(int i =startFrom+1;i<=n;i++) {
                helper(i, remainingSpots -1, current, n);
            }
            current.remove(current.size()-1);
        }
    }
}
