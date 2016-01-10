/**
 * Created by karthik on 7/19/15.
 */
public class DNF {
    public int[] dutchNationalFlag(int[] a) {
        int zeroPointer = 0;
        int twoPointer = a.length -1;
        int i = 0;

        while(i <= twoPointer) {
            if(a[i] == 0 && a[zeroPointer] == 0) {
                i++;
                zeroPointer++;
            } else if(a[i] == 1) {
                i++;
            } else if(a[i] == 0) {
                swap(i, zeroPointer, a);
                zeroPointer++;
            } else {
                swap(i, twoPointer, a);
                twoPointer--;
            }
        }
        return a;
    }

    private void swap(int i, int j, int[] a) {
        int temp  = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
