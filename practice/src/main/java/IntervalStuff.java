/**
 * Created by karthik on 1/9/16.
 */
public class IntervalStuff {
    public static boolean isIntersect(Interval a, Interval b) {
        if(b.start >= a.end || a.start >= b.end) {
           return false;
        } else {
            return true;
        }
    }

    public static Interval intersect(Interval a, Interval b) {
        if(!isIntersect(a, b)) {
            return null;
        } else {
            return new Interval(Math.max(a.start, b.start), Math.min(a.end, b.end));
        }
    }

    public static Interval union(Interval a, Interval b) {
        if(!isIntersect(a, b)) {
            return null;
        } else {
            return new Interval(Math.min(a.start, b.start), Math.max(a.end, b.end));
        }
    }
}
