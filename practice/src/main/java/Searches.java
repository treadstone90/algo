/**
 * Created by karthik on 1/14/16.
 */
public class Searches {
    public static int firstOccurence(int[] a, int target) {
        int lo = 0;
        int hi = a.length - 1;


        while(lo <= hi) {
            int mid = lo +  (hi - lo)/2;

            if(a[mid] > target) {
                hi = mid -1 ;
            } else if(a[mid] == target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return (a[hi] == target)? hi : -1;
    }

    // Given a sequnce like \xxxxxxxxxxxx/
    public static int findLocalMinima(int[] a){
        //okay the key insight is that the first two decrease and the last two increase

        int lo = 1;
        int hi = a.length-2;

        while(lo <= hi) {
            int mid = lo +  (hi - lo)/2;

            if(a[mid] <= a[mid-1] && a[mid] <= a[mid+1]) {
                return mid;
            } else if(a[mid] > a[a.length-2]) {
                lo = mid + 1 ;
            } else if(a[mid] > a[1]) {
                hi = mid - 1;
            } else if(a[mid] < a[a.length -2]) {
                hi = mid -1;
            } else if(a[mid] < a[1]) {
                lo = mid + 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}
