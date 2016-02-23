import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by karthik on 1/11/16.
 */
public class MaxGap {
    public static int maximumGap(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for(int i=0;i<nums.length;i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }

        int maxInterval = (int)Math.ceil((max - min + 1.0)/(nums.length -1)) ;
        Bucket[] buckets = new Bucket[nums.length - 1];

        for(int i=0;i<nums.length;i++) {
            int bucketId = (nums[i] - min)/maxInterval;
            if(buckets[bucketId] == null) {
                Bucket b = new Bucket();
                b.addNumber(nums[i]);
                buckets[bucketId] = b;
            } else {
                buckets[bucketId].addNumber(nums[i]);
            }
        }

        Bucket prev = null;
        int maxGap = Integer.MIN_VALUE;

        if(buckets.length == 1) {
            return buckets[0].max - buckets[0].min;
        }
        for(int i =0; i < buckets.length;i++) {
            Bucket current = buckets[i];
            if(prev == null) {
                prev = current;
            } else {
                maxGap = Math.max(maxGap, current.min - prev.max);
                prev = current;
            }
        }
        return maxGap;
    }

}


class Bucket {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    boolean set;
    int maxGap;

    void addNumber(int num) {
        max = Math.max(max, num);
        min = Math.min(min, num);
    }
}
