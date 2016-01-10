package codeforces;

import java.util.Collections;
import java.util.List;

/**
 * Created by karthik on 12/27/15.
 * The idea is to see the fastest route from either end of yhe
 * mountains to attain quilibyrium. There is a half way point
 * 
 */
public class P253B {
    public static void main(String[] args) {
        MyScanner reader = new MyScanner();
        int n = reader.nextInt();
        String line = reader.nextLine();
        System.out.print(solution(n, reader.toInt(line.split(" "))));
    }

    public static int solution(int n, List<Integer> a) {
        Collections.sort(a);

        int i = 0;
        int j= 0;

        return 0;
    }
}
