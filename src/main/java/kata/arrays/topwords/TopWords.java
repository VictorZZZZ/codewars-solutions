package kata.arrays.topwords;

import java.util.ArrayList;
import java.util.List;

public class TopWords {
    private static final char SPACE = ' ';
    private static final char NEW_LINE = '\n';
    private static final char DOT = '.';
    private static final char COMMA = ',';
    private static final char COLON = ':';
    private static final char DASH = '-';
    private static final char QUESTION = '?';
    private static final char EXCLAM = '!';
    private static final char SLASH = '/';
    private static final char BACK_SLASH = '\\';
    private static final char APOSTROPHE = '\'';
    private static final char QUOTE = '\"';

    private static List<String> uniqueWords;
    private static List<Integer> counters;

    public static List<String> top3(String s) {
        // Your code here
        uniqueWords = new ArrayList<>();
        counters = new ArrayList<>();
        s = s.toLowerCase();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++)  {
            char ch = s.charAt(i);
            if (!isWordEnded(ch)) {
                word.append(ch);
                if(i==s.length()-1) recountWords(word.toString());
            } else {
                recountWords(word.toString());
                word.setLength(0);
            }
        }
        return countTop3();
    }

    private static List<String> countTop3() {
        return get3MaxCountWord(new ArrayList<>(counters));
    }

    private static List<String> get3MaxCountWord(List<Integer> intArr) {
        List<String> result = new ArrayList<>();
        int resultLength = 3;
        if(intArr.size()<3) resultLength =  intArr.size();
        for (int i = 0; i < resultLength; i++) {
            int maxIndex = getMaxIndex(intArr);
            result.add(uniqueWords.get(maxIndex));
            intArr.set(maxIndex,0);
        }
        return result;
    }

    private static int getMaxIndex(List<Integer> intArr) {
        int max = intArr.get(0);
        int maxIndex = 0;
        for (int i = 0; i < intArr.size(); i++) {
            if(max< intArr.get(i)){
                maxIndex = i;
                max = intArr.get(i);
            }
        }
        return maxIndex;
    }

    private static void recountWords(String word) {
        if (word.length() == 0) return;
        if (uniqueWords.contains(word)) {
            int indexOfWord = uniqueWords.indexOf(word);
            Integer wordCount = counters.get(indexOfWord);
            wordCount++;
            counters.set(indexOfWord, wordCount);
        } else {
            uniqueWords.add(word);
            counters.add(1);
        }
    }

    private static boolean isWordEnded(char ch) {
        switch (ch) {
            case SPACE:
            case NEW_LINE:
            case DOT:
            case COMMA:
            case COLON:
            case DASH:
            case QUESTION:
            case SLASH:
            case BACK_SLASH:
            case EXCLAM:
            case APOSTROPHE:
            case QUOTE:
                return true;
            default:
                return false;
        }
    }
}
