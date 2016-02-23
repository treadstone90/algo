package codeforces;

import java.util.List;

/**
 * Created by karthik on 2/2/16.
 */
public class BinarySearch {
    public static void main(String [] args) {
        //
    }

    public static int binarySearch(List<Integer> list, int target) {
        int lo = 0;
        int hi = list.size() -1;

        while(lo <= hi) {
            int mid = lo + (hi - lo)/2; // avoids overflow
            int element = list.get(mid);

            if(element == target) {
                return mid;
            } else if(element > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return -1;
    }
}
