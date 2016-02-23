package codeforces;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by karthik on 1/29/16.
 */
public class P217A {
    static HashSet<Point> visited = new HashSet<Point>();
    public static void main(String[] args) {
        MyScanner s = new MyScanner();
        int n = s.nextInt();

        ArrayList<Point> arr = new ArrayList<Point>();

        for(int i=0;i<n;i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            arr.add(new Point(x, y));
        }
        System.out.println(solution(arr));
    }

    static int solution(ArrayList<Point> point) {
        int count = 0;
        for(int i=0;i<point.size();i++) {
            if(!visited.contains(point.get(i))) {
                dfs(point.get(i), point);
                count = count +1;
            }
        }
        return count -1;
    }

    private static void dfs(Point p, ArrayList<Point> points) {
        visited.add(p);
        for(Point w: points) {
            if(!visited.contains(w) && !w.equals(p) && (w.x == p.x || w.y == p.y)) {
                dfs(w, points);
            }
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        return (x == ((Point) o).x && y == ((Point) o).y);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.x;
        hash = 71 * hash + this.y;
        return hash;
    }
}
