/**
 * Created by karthik on 1/12/16.
 */
public class WalkArray {
    public static int arrayWalk(int[] array) {

        if(array.length == 0) {
            return 1;
        }
        int[] path = new int[array.length];
        int step = 1;
        int maxStep = array[0];
        path[0] = maxStep;

        for(int i=1;i<array.length;i++) {
            if(maxStep < i) {
                if(path[i-1] >= i) {
                    maxStep = path[i-1];
                    step++;
                } else {
                  return -1;
                }
            }
            path[i] = Math.max(path[i-1], i+ array[i]);
        }
        return step;
    }
}
