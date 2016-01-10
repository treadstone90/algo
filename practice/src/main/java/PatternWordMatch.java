import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by karthik on 1/6/16.
 */
public class PatternWordMatch {
    static HashMap<String, String> mapping = new HashMap<>();
    public static void main(String[] args) {
        System.out.print(isMatch("aabbaa", "abcdabcdffabcdabcd"));
        System.out.print(isMatch("a", ""));
    }

    public static boolean isMatch(String pattern, String word) {
        if(word.isEmpty() && pattern.isEmpty()) {
            return true;
        } else if(pattern.isEmpty()){
            return false;
        } else if(word.isEmpty()) {
            return false;
        } else {
            String patternToConsider = pattern.substring(0, 1);
            if(mapping.containsKey(patternToConsider)) {
                String wordMap = mapping.get(patternToConsider);
                String nextWord = word.substring(0, Math.min(wordMap.length(), word.length()));
                if(!nextWord.equals(wordMap)) {
                    return false;
                } else {
                    return isMatch(pattern.substring(1), word.substring(wordMap.length()));
                }
            } else {
                for(int i=0; i<word.length(); i++) {
                    String mapWord = word.substring(0, i + 1);
                    mapping.put(patternToConsider, mapWord);
                    if(isMatch(pattern.substring(1), word.substring(i+1))){
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
