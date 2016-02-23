/**
 * Created by karthik on 2/16/16.
 */
// You need to know how many characters to match when using a */
// Collapse two stars as one.
// when you see a start just keep going. When there is a mismatch
public class RegexMatch {
    public static boolean isMatch(String string, String pattern) {
        int i=0;
        while( i < pattern.length() && i < string.length()) {
            if(pattern.charAt(i) == '*') {
                break;
            } else if(pattern.charAt(i) != '?' && pattern.charAt(i) != string.charAt(i)) {
                return false;
            }
            i++;
        }

        // you are here when string is done or pattern is done or you see a *
        if(i == pattern.length()) {
            return i == string.length();
        } else if(pattern.charAt(i) == '*') {
            return starMatch(string.substring(i), pattern.substring(i));
        } else {
            return false;
        }
    }

    private static boolean starMatch(String string, String pattern) {
        if(string == "") {
            return true;
        } else {
            int i=0;
            while(i < pattern.length() && pattern.charAt(i) == '*') {
                i++;
            }

            if( i == pattern.length()) return true;

            char lookAhead = pattern.charAt(i);

            boolean ans = false;
            for(int j=0;j<string.length();j++) {
                if(string.charAt(j) == lookAhead) {
                    ans = isMatch(string.substring(j+1), pattern.substring(i+1));
                }

                if(ans == true) return true;
            }

            return ans;
        }
    }
}
