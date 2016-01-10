package codeforces;

/**
 * Created by karthik on 1/5/16.
 */
public class P580A {
    public static void main(String [] args) {
        MyScanner reader = new MyScanner();
        int n = reader.nextInt();
        String line = reader.nextLine();
        System.out.print(solution(n, reader.toIntArray(line.split(" "))));
    }

    public static int solution(int n, int[] a) {
        int prev = -1;
        int count = 0;
        int maxCount = 0;
        for(int i=0;i<a.length;i++) {
            if(a[i] >= prev) {
                count++;
            } else {
                count = 1;
            }
            maxCount = max(maxCount, count);
            prev = a[i];
        }
        return maxCount;
    }

    public static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
