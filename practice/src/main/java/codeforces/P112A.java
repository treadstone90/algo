package codeforces;

/**
 * Created by karthik on 12/26/15.
 */
public class P112A {
    public static void main(String[] args) {
        MyScanner reader  = new MyScanner();
        String input1 = reader.nextLine();
        String input2 = reader.nextLine();
        System.out.print(solution(input1, input2));
    }

    public static String solution(String input1, String input2) {
        assert (input1.length() == input2.length());

        for(int i=0; i < input1.length();i++) {
            char a = Character.toLowerCase(input1.charAt(i));
            char b = Character.toLowerCase(input2.charAt(i));
            if(a < b) {
                return "-1";
            } else if (a > b) {
                return "1";
            }
        }
        return "0";
    }
}
