package kata.words.reverse;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordsReverse {

    public static String reverseWords(final String original)
    {
        if(original.split(" ").length==0) return original;
        return Arrays.stream(original.split(" "))
                .map(word -> {
                    StringBuilder stringBuilder = new StringBuilder();
                    char[] chrWord = word.toCharArray();
                    for(int i=chrWord.length-1;i>=0;i--){
                        stringBuilder.append(chrWord[i]);
                    }
                    return stringBuilder.toString();
                }).collect(Collectors.joining(" "));
    }
}
