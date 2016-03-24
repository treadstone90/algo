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
        Tuple<Integer, Integer> pair = new Tuple(0,0);

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
