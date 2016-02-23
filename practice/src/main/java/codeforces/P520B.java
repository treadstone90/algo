package codeforces;

import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by karthik on 1/26/16.
 */
public class P520B {
    public static void main(String[] args) {
        MyScanner reader = new MyScanner();
        int n = reader.nextInt();
        int m = reader.nextInt();
        System.out.println(solution(n, m));
    }

    public static int solution(int n , int m) {
        Queue<Integer> queue = new LinkedBlockingDeque<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(n);
        visited.add(n);

        int level = 0;// Says the levek being processe starting from 0
        int numProcessed = 0;
        int nodesInCurrentLevel = 1;
        int nodesInNextLevel = 0;

        while(!queue.isEmpty()) {
            int root = queue.poll();
            if(root == m) {
                return level;
            }

            int red = root*2;
            int blue = root -1;
            if(red -1 <= m && !visited.contains(red)) {
                queue.add(red);
                visited.add(red);
                nodesInNextLevel++;
            }

            if(blue > 0 && !visited.contains(blue)) {
                queue.add(blue);
                visited.add(blue);
                nodesInNextLevel++;
            }
            numProcessed++;

            if(numProcessed == nodesInCurrentLevel) {
                level++;
                nodesInCurrentLevel = nodesInNextLevel;
                numProcessed = 0;
                nodesInNextLevel = 0;
            }

        }

        return -1;
    }
}
