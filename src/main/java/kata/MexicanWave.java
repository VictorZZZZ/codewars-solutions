package kata;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class MexicanWave {
    public static String[] wave(String str) {
        // Your code here
        if(str.isEmpty()) return new String[] {};
        String[] result = new String[0];
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder(str);
            if(sb.charAt(i)==' ') continue;
            sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            result = Arrays.copyOf(result,result.length+1);
            result[result.length-1]=sb.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        MexicanWave.wave("two words");
    }
}
