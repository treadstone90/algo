import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by karthik on 2/22/16.
 */
public class ExpressionEvaluator {
    static HashMap<String, List<Integer>> expressionCache = new HashMap<>();
    public static List<Integer> computeExpression(String str) {
        if (str.length() == 1) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(Integer.parseInt(str));
            return a;
        } else {
            List<Integer> ans = new ArrayList<>();

            for (int i = 1; i < str.length(); i += 2) {
                String operator = str.substring(i, i + 1);
                String first = str.substring(0, i);
                String tail = str.substring(i + 1);
                System.out.println(first + " " + operator + " " + tail);
                List<Integer> firstAns = computeExpression(first);
                List<Integer> lastAns = computeExpression(tail);

                for (int a : firstAns) {
                    for (int b : lastAns) {
                        if(eval(a, b, operator) != null) {
                            ans.add(eval(a, b, operator));
                        }
                    }
                }
            }
            expressionCache.put(str, ans);
            return ans;
        }
    }


    public static Integer eval(int op1, int op2, String operator) {
        if(operator.equals("+")) {
            return op1 + op2;
        } else if(operator.equals("*")){
            return op1*op2;
        } else if(operator.equals("/")) {
            if(op2 != 0) return op1/op2;
            else return null;
        } else {
            return op1-op2;
        }
    }
}
