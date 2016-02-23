import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by karthik on 2/20/16.
 */
public class MinWindowString {
    public static String minWindow(String s, String t) {
        HashSet<Character> interest = new HashSet<Character>();
        for(int i = 0;i<t.length();i++) {
            interest.add(t.charAt(i));
        }

        HashMap<Character, Integer> set = new HashMap<Character, Integer>();

        int start_min = 0;
        int end_min = 0;
        int minLength = Integer.MAX_VALUE;
        int i = -1;
        int j = 0;

        while(j < s.length()) {
            if(interest.contains(s.charAt(j))) {
                Integer oldIndex = set.get(s.charAt(j));
                if( i == -1) {
                    i = j;
                    set.put(s.charAt(j), j);
                } else if(oldIndex != null && oldIndex.intValue() == i) {
                    set.remove(s.charAt(i));
                    i++;
                    set.put(s.charAt(j), j);
                    while(i < s.length()) {
                        Integer index = set.get(s.charAt(i));
                        if(index != null && i == index) {
                            break;
                        }
                        i++;
                    }
                } else {
                    set.put(s.charAt(j), j);
                }
            }

            if(set.size() == t.length() && j - i + 1 < minLength) {
                minLength = j - i+ 1;
                start_min = i ;
                end_min = j;
                set.remove(s.charAt(start_min));
            }
            j++;
        }
        if(i == -1) {
            return "";
        } else {
            return s.substring(start_min, end_min + 1);
        }
    }
}
