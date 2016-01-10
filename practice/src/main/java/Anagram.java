///**
// * Created by karthik on 8/9/15.
// */
//public class Anagram {
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) {
//            return false;
//        } else {
//            int[] charMap = new int[26];
//
//            for(int i=0;i<s.length();i++) {
//                charMap[s.charAt(i) - 97] = 1;
//            }
//
//            for(int i=0;i<t.length();i++) {
//                charMap[t.charAt(i) - 97] = 0;
//            }
//
//            for(int i=0;i<charMap.length;i++) {
//                if(charMap[i] == 1)
//                    return false;
//            }
//            return  true;
//        }
//        int ans = 0;
//        String s;
//        for(int i=s.length()-1; i>=0;i--) {
//            ans = ans + (int)Math.pow(26, s.length()-1 - 1)*mapString(s.charAt(i));
//        }
//
//    }
//
//
//}
