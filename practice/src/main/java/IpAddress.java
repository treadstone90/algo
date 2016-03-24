import java.util.*;

public class IpAddress {
    static class Tuple {
        String s;
        int num;

        public Tuple(String s, int num) {
            this.s = s;
            this.num = num;
        }
    }

    static HashMap<Tuple, List<String>> cache = new HashMap<Tuple, List<String>>();
    public static List<String> restoreIpAddresses(String s) {
        if(s.length() > 12) {
            return new ArrayList<String>();
        }

        List<String> ans = restoreIpAddressesHelper(s, 3);
        if(ans == null) {
            return new ArrayList<String>();
        } else {
            return ans;
        }
    }

    public static List<String> restoreIpAddressesHelper(String s, int num) {
        Tuple t = new Tuple(s, num);
        if(s.length() == 0) {
            return null;
        } else if(num == 0 && Long.parseLong(s) <= 255L && ( (s.length() > 1 && !s.startsWith("0")) || s.length() == 1) )  {
            List<String> ans = new ArrayList<String>();
            ans.add(s);
            return ans;
        } else if(num == 0) {
            return null;
        } else if(cache.containsKey(t)){
            return cache.get(t);
        } else {
            List<String> solution = new ArrayList<String>();
            for(int i=0;i<Math.min(3, s.length());i++) {
                String prefix = s.substring(0, i+1);

                if((prefix.length() > 1 && !prefix.startsWith("0") || prefix.length() == 1) && Integer.parseInt(prefix) <=255) {
                    String suffix = s.substring(i+1);
                    List<String> children = null;
                    if(num - 1 == 0) {
                        if(((suffix.length() > 1 && !suffix.startsWith("0")) || suffix.length() == 1) && Long.parseLong(suffix) <= 255L) {
                            List<String> ans = new ArrayList<String>();
                            ans.add(suffix);
                            children = ans;
                        }
                    } else {
                        children = restoreIpAddressesHelper(s.substring(i+1), num-1);
                    }

                    if(children != null) {
                        for(String w: children) {
                            solution.add(prefix +"." +w);
                        }
                    }
                }
            }

            cache.put(new Tuple(s, num), solution);
            return solution;
        }
    }
}