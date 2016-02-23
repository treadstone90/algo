/**
 * Created by karthik on 1/9/16.
 */
public class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int size = end - start +1 ;

    public void setEnd(int a) {
        this.end = a;
    }

    public void setStart(int a) {
        this.start = a;
    }
}
