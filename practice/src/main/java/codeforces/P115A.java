package codeforces;

import java.util.ArrayList;

/**
 * Created by karthik on 1/26/16.
 */
public class P115A {
    public static void main(String[] args) {
        MyScanner s = new MyScanner();
        int n = s.nextInt();
        ArrayList<ArrayList<Integer>> dep = new ArrayList<ArrayList<Integer>>(n);

        for(int i=0;i<n;i++) {
            dep.add(i, new ArrayList<Integer>());
        }

        for(int i=0;i<n;i++) {
            int manager = s.nextInt();
            if(manager != -1 && dep.get(manager-1) == null) {
                ArrayList<Integer> neigh = new ArrayList<Integer>();
                neigh.add(i);
                dep.set(manager-1, neigh);
            } else if(manager != -1) {
                dep.get(manager-1).add(i);
            }
        }
        //System.out.println(dep);
        System.out.println(solution(n, dep));
    }

    public static int solution(int n, ArrayList<ArrayList<Integer>> neighbors) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            max = Math.max(max, dfs(i, neighbors));
        }
        return max;
    }

    private static int dfs(int n, ArrayList<ArrayList<Integer>> neighbors) {
        int height = 0;
        for(Integer neighbor : neighbors.get(n)) {
            height = Math.max(height, dfs(neighbor, neighbors));
        }
        return height + 1;
    }
}
