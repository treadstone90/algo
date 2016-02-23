import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by karthik on 2/2/16.
 */
public class Realign {

    public Map<String, List<Interval>> realign(TreeMap<String, Integer> initial,
                                               TreeMap<String, Integer> final_,
                                               HashMap<String, List<Interval>> intervals) {

        Queue<Interval> extraIntervals = new LinkedBlockingDeque<>();

        for (Map.Entry<String, Integer> entry : initial.entrySet()) {
            Integer initialPercentage = entry.getValue();
            Integer finalPercentage = final_.get(entry.getKey());

            List<Interval> currentIntervals = intervals.get(entry.getKey());

            if (finalPercentage == 0) {
                extraIntervals.addAll(currentIntervals);
            } else if (finalPercentage < initialPercentage) {
                int diff = finalPercentage - initialPercentage;

                for (Interval a : currentIntervals) {
                    if (a.size <= diff) {
                        extraIntervals.add(a);
                        diff = diff - a.size;

                    } else {
                        extraIntervals.add(new Interval(a.end+1 - diff, a.end));
                        a.setEnd(a.end - diff);
                        break;
                    }

                    if (diff == 0) {
                        break;
                    }
                }
            }

        }

        TreeMap<String, List<Interval>> op = new TreeMap<>();

        // Inst

        for(Map.Entry<String, Integer> entry : initial.entrySet()) {
            Integer initialPercentage = entry.getValue();
            Integer finalPercentage = final_.get(entry.getKey());
            int diff = finalPercentage - initialPercentage;
            List<Interval> currentIntervals = intervals.get(entry.getKey());

                while(diff > 0) {
                    Interval extra = extraIntervals.poll();
                    if (extra.size <= diff) {
                        currentIntervals.add(extra);

                    } else {
                        currentIntervals.add(new Interval(extra.end+1 - diff, extra.end));
                        extra.setEnd(extra.end - diff);
                        extraIntervals.add(extra);
                        break;
                    }

                    diff = diff - extra.size;
                }
                op.put(entry.getKey(), currentIntervals);

        }
        return op;
    }
}
