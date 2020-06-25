package kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JadenCase {
    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if(phrase!=null && !phrase.isEmpty()){
            Pattern pattern = Pattern.compile("^([a-z])|\\s([a-z])");
            Matcher matcher = pattern.matcher(phrase);

            StringBuffer result = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(result, matcher.group().toUpperCase());
            }
            matcher.appendTail(result);
            System.out.println(result.toString());
            return result.toString();
        }
        return null;
    }
}
