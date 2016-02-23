package codeforces;

import java.util.HashMap;

/**
 * Created by karthik on 2/22/16.
 */
public class SubstringWithUniqe {
    //return longest substring with k unique characters
    public static String solution(String str, int k) {
        String maxString = "";
        int maxLength = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        if(str.length() == 1 && k > 1) {
            return "";
        }

        int start = -1;
        int end = 0;

        while(end < str.length()) {
            char c = str.charAt(end);
            if(start == -1) {
                start = end;
            }

            if(map.containsKey(c)) {
                map.put(c, map.get(c) +1);
            } else {
                map.put(c, 1);
            }

            // this means there is a new character in town
            if(map.size() > k) {
                // advance start and remove from map so that
                // you have one less unique character.... So basically
                // asat every character if hey are u the last occurence of a character
                if(end - start > maxLength) {
                    maxLength = end - start;
                    maxString = str.substring(start, end);
                }

                while(map.containsKey(str.charAt(start))) {
                    int count = map.get(str.charAt(start));
                    if(count == 1) {
                        map.remove(str.charAt(start));
                        start++;
                        break;
                    }
                    map.put(str.charAt(start), count -1);
                    start++;
                }
            }
            end++;
        }

        if(map.size() == k) {
            if(end - start > maxLength) {
                maxString = str.substring(start, end);
            }
        } else if(map.size() < k) {
            return "";
        }
        return maxString;
    }
}
