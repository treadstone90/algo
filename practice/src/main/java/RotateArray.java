/**
 * Created by karthik on 2/7/16.
 */
public class RotateArray {
    public static int[] solution(int[] a, int k) {
        reverseArray(a, 0, a.length -1, k);
        reverseArray(a, 0, k-1, k-1);
        reverseArray(a, k, a.length-1, k-1);
        return a;
    }
    public static void reverseArray(int[] a, int start, int end, int k) {
        for(int i=0;i<Math.min(k, (end-start+1)/2);i++) {
            int index = start+i;
            int temp = a[index];
            a[index] = a[end-i];
            a[end-i] = temp;
        }
    }

}
