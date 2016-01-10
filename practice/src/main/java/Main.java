/**
 * Created by karthik on 9/22/15.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

    }
}

class LineReader {
    public static String[] LineReader(int numberLines) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer("");

        long count = 0;
        String temp[] = null;
        for (int i = 0; i < numberLines; ++i) {
            try {
                temp = br.readLine().split(" ");
            } catch(Exception e) {}
            int u = Integer.parseInt(temp[0]);
            int v = Integer.parseInt(temp[1]);

        }
        return temp;
    }
}
