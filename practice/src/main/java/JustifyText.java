import java.util.ArrayList;
import java.util.List;

/**
 * Created by karthik on 2/10/16.
 */
public class JustifyText {
    public static void main(String[] args) {

    }

    public static List<String> solution(String[] words, int n) {
        int i=0;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> currentList = new ArrayList<>();
        int currentListCharSize = 0;
        while(i < words.length) {
            String word = words[i];

            if (currentListCharSize + currentList.size() + word.length() <= n) {
                currentListCharSize += word.length();
                currentList.add(word);
            } else {
                int numberWords = currentList.size();
                int remainingSpaces = n - currentListCharSize;

                if (numberWords == 1) {
                    list.add(currentList.get(0).concat(spaces(remainingSpaces)));
                } else {
                    list.add(flush(currentList, n, currentListCharSize));
                }
                currentList.clear();
                currentList.add(word);
                currentListCharSize = 0;
                currentListCharSize += word.length();
            }
            i++;
        }

        list.add(flush(currentList, n, currentListCharSize));
        return list;
    }

    private static String flush(ArrayList<String> currentList, int n, int currentListCharSize) {
        int numberWords = currentList.size();
        int remainingSpaces = n - currentListCharSize;
        if (numberWords == 1) {
            return currentList.get(0).concat(spaces(remainingSpaces));
        } else {
            int spacesPerWords = remainingSpaces / (numberWords - 1);
            int endSpaces = remainingSpaces % (numberWords - 1);


            String joinedString = String.join(spaces(spacesPerWords), currentList)
                    .concat(spaces(endSpaces));
            return joinedString;
        }
    }

    private static String spaces(int n) {
        StringBuffer buf = new StringBuffer();
        for(int k=0; k<n;k++) {
            buf.append("^");
        }
        return buf.toString();
    }
}
