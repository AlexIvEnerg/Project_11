import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_example {
    public static void main(String[] args) {
        String string = "fffff ab f 1234 jkjk";
        Pattern pat1 = Pattern.compile("\\w{2,}");
        Matcher match = pat1.matcher(string);
        while (match.find()) {
            if (match.lookingAt()) {
                System.out.println(string.substring(match.start(), match.end()));
                break;
            }
        }
    }
}