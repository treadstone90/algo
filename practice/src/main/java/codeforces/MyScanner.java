package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by karthik on 12/24/15.
 */
class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public ArrayList<Integer> toInt(String[] line) {
        ArrayList<Integer> ret = new ArrayList(line.length);
        for(int i=0;i<line.length;i++) {
            ret.add(i, Integer.parseInt(line[i].trim()));
        }
        return ret;
    }

    public int[] toIntArray(String[] line) {
        int[] ret = new int[line.length];
        for(int i=0;i<line.length;i++) {
            ret[i] = Integer.parseInt(line[i]);
        }
        return ret;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}
