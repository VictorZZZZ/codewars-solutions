package kata.scramble;

import java.util.concurrent.atomic.AtomicBoolean;


/**
 * Description:
 *
 * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 *
 * Notes:
 *
 *     Only lower case letters will be used (a-z). No punctuation or digits will be included.
 *     Performance needs to be considered
 *
 * Input strings s1 and s2 are null terminated.
 *
 * Examples
 *
 * scramble('rkqodlw', 'world') ==> True
 * scramble('cedewaraaossoqqyt', 'codewars') ==> True
 * scramble('katas', 'steak') ==> False
 */
public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        AtomicBoolean result = new AtomicBoolean(true);
        final String[] testStr = {str1};
        str2.chars().forEach(c->{
            int indexOfChar = testStr[0].indexOf(Character.toString(c)) ;
            if(indexOfChar >= 0) {
                testStr[0] = testStr[0].substring(0, indexOfChar) + testStr[0].substring(indexOfChar+1);
            } else {
                result.set(false);
            }
        });
        return result.get();
    }
}
