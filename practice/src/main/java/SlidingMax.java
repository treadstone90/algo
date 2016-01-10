import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created by karthik on 7/22/15.
 */
public class SlidingMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1) {
            return nums;
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i=0;
        Deque<Integer> q = new ArrayDeque<Integer>();

        while( i < nums.length ) {
            int element = nums[i];

            while(!q.isEmpty() && nums[q.peekLast()] < element) {
                q.removeLast();
            }

            q.addLast(i);

            if(i >= k-1) {
                int maxIndex = q.peekFirst();
                ans.add(nums[maxIndex]);

                if(maxIndex <= (i-k+1)) {
                    q.removeFirst();
                }
            }
            i++;
        }
        return buildIntArray(ans);
    }

    private int[] buildIntArray(List<Integer> integers) {
        int[] ints = new int[integers.size()];
        int i = 0;
        for (Integer n : integers) {
            ints[i++] = n;
        }
        return ints;
    }
}
