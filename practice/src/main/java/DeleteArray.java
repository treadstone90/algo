import java.util.Arrays;

/**
 * Created by karthik on 1/12/16.
 */
public class DeleteArray {
    public static int[] deleteArray(int[] a, int target) {
        int count = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i] == target) {
                count++;
            } else if(count > 0) {
                a[i - count] = a[i];
            }
        }
        return a;

        //Arrays.binarySearch()
    }

    public static int[] deleteDuplicates(int[] a) {
        int writeIndex = 0;
        int prev = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i] != prev) {
                a[writeIndex++] = a[i];
            }
            prev = a[i];
        }
        return a;
    }

    public static int[] deleteDuplicates(int[] a, int m) {
        // if any number x appaears m times make it appear only min(2, m)
        //1,1,2,2,2,4,5 -> 1,1,2,2,4,5
        //1,1,1,2,2,2,2,4,5 -> 1,1,2,2,2,2,4,5
        int writeIndex = -1;
        int duplicateCount = 0;
        int prev = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(prev == a[i]) {
                duplicateCount++;
                writeIndex++;
            } else {
                if(duplicateCount+1 == m) {
                    writeIndex = writeIndex - (duplicateCount - 2);
                } else {
                    writeIndex++;
                }
                duplicateCount = 0;
            }
            prev = a[i];
            System.out.print(writeIndex);
            a[writeIndex] = a[i];
        }
        return a;
    }


}
