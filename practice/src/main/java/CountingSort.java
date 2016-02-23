import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by karthik on 1/10/16.
 */
public class CountingSort {
    public static void sort(int [] a) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i=-0; i<a.length; i++) {
            Integer val = map.get(a[i]);
            if(val == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], val +1);
            }
        }

        int arrayIndex = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            Integer key = entry.getKey();
            Integer count = entry.getValue();

            while (count-- > 0) {
                a[arrayIndex] = key;
                arrayIndex++;
            }
        }
    }
}
