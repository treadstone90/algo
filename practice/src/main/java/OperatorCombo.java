import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by karthik on 3/6/16.
 */
public class OperatorCombo {

    HashMap<Tuple<String, Integer>, List<String>> cache = new HashMap<>();
    public List<String> addOperators(String num, int target) {
        List<String> ans = addOperatorsHelper(num, target);
        if(ans == null) {
            return new ArrayList<String>();
        } else {
            return ans;
        }
    }

    public List<String> addOperatorsHelper(String num, int target) {
        Tuple<String, Integer> t = new Tuple<String, Integer>(num, target);
        if(num.length() == 1 && target == Integer.parseInt(num)) {
            List<String> ans = new ArrayList<String>();
            ans.add(num);
            return ans;
        } else if(num.length() == 1 && target != Integer.parseInt(num)) {
            return null;
        } else if(cache.containsKey(t)){
            return cache.get(t);
        } else {
            List<String> solution = new ArrayList<>();
            for(int i=0;i<num.length();i++) {
                String prefix = num.substring(0, i+1);
                int prefixNum = Integer.parseInt(prefix);

                if(prefix.startsWith("0") && prefix.length() > 1) {
                    continue;
                }

                String suffix = num.substring(i+1);

                List<String> plusChildren = null;
                List<String> minusChildren = null;
                List<String> mulChildren = null;

                if(prefixNum == target && suffix.length() == 0) {
                    solution.add(prefix);
                } else {
                    if (prefixNum <= target) {
                        plusChildren = addOperatorsHelper(suffix, target - prefixNum);
                        if (prefixNum != 0 && target % prefixNum == 0) {
                            mulChildren = addOperatorsHelper(suffix, target / prefixNum);
                        } else if(prefixNum == 0 && target == 0) {
                            mulChildren = new ArrayList<>();
                            mulChildren.add(suffix);
                        }
                    }

                    if (prefixNum >= target) {
                        minusChildren = addOperatorsHelper(suffix, prefixNum - target);
                    }
                }

                if(!(plusChildren == null)) {
                    for(String w: plusChildren) {
                        solution.add(prefix + "+" + w);
                    }
                }
                if(!(minusChildren == null)) {
                    for(String w: minusChildren) {
                        solution.add(prefix + "-" + w);
                    }
                }
                if(!(mulChildren == null)) {
                    for(String w: mulChildren) {
                        solution.add(prefix + "*" + w);
                    }
                }
            }

            cache.put(new Tuple<String, Integer>(num, target), solution);
            return solution;
        }
    }

}
