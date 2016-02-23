import java.util.*;

/**
 * Created by karthik on 1/16/16.
 */
public class HashTables {
    public static int longestDistinctArray(int[] a) {
        HashMap<Integer, Integer> seenNumbers = new HashMap<>();

        int start = 0;
        int end = 0;
        int maxLength = 0;
        while(end < a.length) {
            if(!seenNumbers.containsKey(a[end])) {
                seenNumbers.put(a[end], end);
                maxLength = Math.max(maxLength, end - start +1);
            } else {
                int targetIndex = seenNumbers.get(a[end]);
                while(start <= targetIndex) {
                    seenNumbers.remove(a[start]);
                    start++;
                }
                seenNumbers.put(a[end], end);
                maxLength = Math.max(maxLength, end - start +1);
            }
            end++;
        }

        return maxLength;
    }

    public static int longestContainedInterval(int[] a) {
        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<a.length;i++) {
            set.add(a[i]);
        }

        int i =0;
        int maxLength = 0;
        while(!set.isEmpty()) {
            int num = a[i];
            if(set.contains(num)) {
                int count = 0;
                set.remove(num);
                count++;

                // expand right
                int j= 1;
                while(set.contains(num + j)) {
                    set.remove(num+j);
                    j++;
                    count++;
                }

                j = 1;
                while (set.contains(num -j)) {
                    set.remove(num - j);
                    j--;
                    count++;
                }
                maxLength = Math.max(maxLength, count);
            }
            i++;
        }

        return maxLength;
    }

    public boolean containsAllWords(String sentence, HashMap<String, Boolean> words, int wordLength) {
        int i = 0;

        while(i + wordLength < sentence.length()) {
            String word = sentence.substring(i, i + wordLength);
            if(!words.containsKey(word) || words.get(word) == false) {
                return false;
            } else {
                i = i+ wordLength;
            }
        }
        return true;
    }

}
