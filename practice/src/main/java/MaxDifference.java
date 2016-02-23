/**
 * Created by karthik on 1/13/16.
 */
public class MaxDifference {
    //Given an array return the max difference between any two indices i, j where i < j
    public static int maxDifference(int[] a) {
        int maxDiff = 0;
        int minSoFar = a[0];
        int maxSoFar = a[0];
        for(int i=0;i<a.length;i++) {
            if(a[i] < minSoFar) {
                minSoFar = a[i];
                maxSoFar = a[i];
            } else if(a[i] > maxSoFar) {
                maxSoFar = a[i];
            }
            maxDiff = Math.max(maxDiff, maxSoFar - minSoFar);
        }
        return maxDiff;
    }

    public static int maxFlatLine(int[] a) {
        if(a.length == 0) {
            return 0;
        } else {
            int maxLength = 1;
            int currentIndex = -1;
            int prev = Integer.MAX_VALUE;
            for(int i=0;i<a.length;i++) {
                if(a[i] != prev) {
                    currentIndex = i;
                }
                prev = a[i];
                maxLength = Math.max(maxLength, i - currentIndex+1);
            }
            return maxLength;
        }
    }
}
