package codeforces;

import java.util.BitSet;

/**
 * Created by karthik on 1/29/16.
 */
public class P330B {
    public static void main(String[] args) {
        MyScanner s = new MyScanner();
        int n = s.nextInt();
        int m = s.nextInt();

        BitSet bs = new BitSet(1000);

        for(int i=0;i<m;i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            bs.set(a);
            bs.set(b);
        }

        int firstClearBit = bs.nextClearBit(1);
        System.out.println(n-1);
        for(int i=1;i<=n;i++) {
            if(i != firstClearBit)
                System.out.println(i + " " + firstClearBit);
        }
    }
}
