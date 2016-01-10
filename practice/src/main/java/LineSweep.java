import java.util.List;
import java.util.Stack;

/**
 * Created by karthik on 8/27/15.
 */
public class LineSweep {
    //assume that the array indices give the x axis of the points
    List<Integer> lineSweep(int[] points) {
        Stack<Integer> s = new Stack<Integer>();

        for(int i=0;i < points.length; i++) {
            if(s.isEmpty()) {
                s.push(points[i]);
            } else {
                while(!s.isEmpty() && s.peek() > points[i]) {
                    s.pop();
                }
                s.push(points[i]);
            }
        }
        return s.subList(0, s.size() -1);
    }
}