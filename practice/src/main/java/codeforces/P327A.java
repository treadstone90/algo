package codeforces;

/**
 * Created by karthik on 1/4/16.
 */
public class P327A {
    public static void main(String [] args) {
        MyScanner reader = new MyScanner();
        int n = reader.nextInt();
        String line = reader.nextLine();
        System.out.print(solution(n, reader.toIntArray(line.split(" "))));
    }

    public static int solution(int n, int[] a) {
        int sSoFar = 0;
        int maxSum = 0;

        int start = -1;
        int maxStart = -1;
        int maxEnd = -1;

        if(a.length == 1) {
            return 1-a[0];
        }

        for(int i=0;i<a.length;i++) {
            int num = translate(a[i]);
            sSoFar += num;

            if(sSoFar <= 0) {
                start = i + 1;
                sSoFar = 0;
            } else {
                if(start == -1) {
                    start = i;
                }
                if(sSoFar > maxSum) {
                    maxEnd = i;
                    maxStart = start;
                    maxSum = sSoFar;
                }
            }
        }

        if(maxSum == 0){
            return a.length - 1;
        }

        int count =0;
        for(int i=0;i<maxStart;i++) {
            count = count + a[i];
        }

        if(maxStart > -1) {
            for (int i = maxStart; i <= maxEnd; i++) {
                count = count + (1 - a[i]);
            }
        }

        for(int i=maxEnd+1;i<a.length;i++) {
            count = count + a[i];
        }

        return count;

    }

    public static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int translate(int num) {
        if(num == 1) {
            return -1;
        } else {
            return 1;
        }
    }
}
