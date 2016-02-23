import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by karthik on 7/25/15.
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        Integer[] newArray = new Integer[nums.length];
        int i = 0;
        int numberOfDigits = 0;
        for (int value : nums) {
            if(value != 0) {
                numberOfDigits += (int) (Math.log10(value) + 1);
            } else {
                numberOfDigits += 1;
            }
            newArray[i++] = Integer.valueOf(value);
        }

        final int a = numberOfDigits;

        Arrays.sort(newArray, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                double o1Digits = (o1 == 0) ? 1 : ((int) (Math.log10(o1) + 1));
                double o2Digits = (o2 == 0) ? 1 : ((int) (Math.log10(o2) + 1));
                if((Math.pow(10, a-o1Digits) * o1 + o2) > (Math.pow(10, a-o2Digits) * o2 + o1)) {
                    return -1;
                } else if((Math.pow(10, a-o2Digits) * o2 + o1) > (Math.pow(10, a-o1Digits) * o1 + o2)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        StringBuffer buf = new StringBuffer();
        for(Integer num : newArray) {
            buf.append(num.toString());
        }
        if(buf.toString().matches("0*")) {
            return "0";
        } else {
            return buf.toString();
        }
    }
}
