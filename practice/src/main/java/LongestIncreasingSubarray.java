import java.util.List;
import java.util.Stack;

/**
 * Created by karthik on 2/7/16.
 */
public class LongestIncreasingSubarray {
    public static void main(String[] args) {
    }

    public static Tuple solution(List<Integer> list) {
        int maxLength = 1;
        Tuple pair = new Tuple(0,0);

        if(list.size() == 1) {
            return pair;
        }

        int prev = list.get(0);

        int start = 0;
        int i = 1;

        while( i < list.size()) {
            if(list.get(i) > prev) {
                if( i - start + 1 > maxLength) {
                    maxLength = i-start+1;
                    pair.a = start;
                    pair.b = i;
                }

            } else {
                if(i + maxLength - 1 > list.size()) {
                    break;
                }
                start = i;
            }
            prev = list.get(i);
            i++;
        }

        return pair;
    }
}
public class Solution {
    public String simplifyPath(String path) {
        String[] components = path.split("/+");
        Stack<String> stack = new Stack<String>();

        for(int i=0;i<components.length;i++) {
            String t = components[i].trim();
            if(t.length() > 0) {
                if(t.equals("..") && !stack.isEmpty()) {
                    stack.pop();
                } else if(!t.equals(".")) {
                    stack.push(t);
                }
            }
        }
        StringBuffer buf = new StringBuffer();
        buf.ap("/");
        while(!s.isEmpty()) {
            buf.add(s.pop());
            buf.add("/");
        }

        String ans = buf.toString();
        if(!buf.toString().equals("/")) {
            ans = ans.substring(0, ans.length()-1);
        }
        ans.ma
        return ans;
    }
}
