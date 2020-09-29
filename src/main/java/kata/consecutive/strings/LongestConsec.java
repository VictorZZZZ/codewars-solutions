package kata.consecutive.strings;

/**
 * You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 * Example:
 *
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 *
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 * Note
 * consecutive strings : follow one after another without an interruption
 */

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length) {
            System.out.println();
            return "";
        }
        int maxLenght = 0;
        int maxIndex = 0;
        for (int i = 0; i < strarr.length; i++) {
            int length = 0;
            for (int j = i; j < i + k; j++) {
                if (i + k > strarr.length) break;
                length += strarr[j].length();
            }
            if (length > maxLenght) {
                maxLenght = length;
                maxIndex = i;
            }
        }
        String result = "";
        for (int i = maxIndex; i < maxIndex + k; i++) {
            result = result + strarr[i];
        }
        return result;
    }

}
