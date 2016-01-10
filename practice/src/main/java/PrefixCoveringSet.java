import java.util.HashMap;

/**
 * Created by karthik on 8/12/15.
 */
public class PrefixCoveringSet {
    public int solution(int[] A) {
        int count = 0;

        HashMap<Integer, Boolean> m = new HashMap<Integer, Boolean>();

        for(int i=0;i<A.length;i++) {
            m.put(A[i], false);
        }

        count = m.size();
        int ans = -1;

        for(int i=0;i<A.length;i++) {
            int element = A[i];
            if(!m.get(element)) {
                m.put(element, true);
                count--;
            }

            if(count == 0) {
                return i;
            }
        }

        return A.length -1;
    }
}
