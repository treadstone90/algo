package codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by karthik on 12/26/15.
 */
public class P160A {
    public static void main(String[] args) {
        MyScanner reader = new MyScanner();
        int n = reader.nextInt();
        String line = reader.nextLine();
        System.out.print(solution(n, reader.toInt(line.split(" "))));
    }

    public static int solution(int n, List<Integer> a) {
        Collections.sort(a, Collections.reverseOrder());

        int sum = 0;
        for(Integer i : a) {
            sum += i;
        }

        int takenSum=0;
        int i =0;
        while(takenSum <= (sum - takenSum)) {
            takenSum += a.get(i);
            i++;
        }
        return i;
    }
}
