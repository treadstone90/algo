import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by karthik on 2/28/16.
 */
public class Combinations2 {
    List<List<Integer>> solution = new ArrayList<>();
    public List<List<Integer>> combine(int targetSum, int k) {
        solution.clear();

        for(int i=1;i<=9;i++) {
                helepr(i, k, 0, targetSum, new ArrayList<>());

        }
        return solution;
    }

    public boolean helepr(int root, int remainingSpots, int currentSum, int targetSum, List<Integer> current) {
        if(currentSum == targetSum && remainingSpots > 0) {
            return false;
        }
        else if(remainingSpots == 0) {
            return false;
        } else if(remainingSpots == 1) {
            if(currentSum + root == targetSum) {
                current.add(root);
                List<Integer> ans = new ArrayList<>();
                ans.addAll(current);solution.add(ans);
                current.remove(current.size() - 1);
                return true;
            } else {
                return false;
            }
        } else {
            currentSum = currentSum + root;
            current.add(root);
            if (currentSum == targetSum) {
                return false;
            } else if(currentSum > targetSum) {
                current.remove(current.size() - 1);
                return false;
            } else  {
                boolean ans=false;
                for(int i=root+1;i <=9;i++) {
                    ans = helepr(i, remainingSpots-1, currentSum, targetSum, current);
                    if(ans) {
                        break;
                    }
                }
                current.remove(current.size() - 1);
                return ans;
            }
        }
    }

}
