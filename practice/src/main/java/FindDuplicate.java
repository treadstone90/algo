/**
 * Created by karthik on 3/20/16.
 */
public class FindDuplicate {
    public static int solution(int [] a) {
        // where a represents in array with the duplicate element

        // what I am going to do is split the range (1...n) and find the element in the ra
        // range that is the duplicate

        int lo = 1;
        int hi = a.length-1;

        if(a.length == 1) {
            return 1;
        }


        while(lo < hi) {
            int mid = lo + (hi - lo)/2; // round down

            int uniqueItemsinLow = mid - lo +1;

            int itemsOfArray = 0;
            for(int item: a) {
                if(item >= lo && item <=mid) {
                    itemsOfArray++;
                }
            }

            if(itemsOfArray > uniqueItemsinLow) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}
