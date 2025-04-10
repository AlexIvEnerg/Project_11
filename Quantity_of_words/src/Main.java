import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String textSent = "One two three раз два три one1 two2 123 ";
        Pattern patt = Pattern.compile("[A-Z]?[a-z]{2,}\\b");
        Matcher matcher = patt.matcher(textSent);
        int quan=0;
        while (matcher.find()) {
            quan++;
            System.out.println(textSent.substring(matcher.start(), matcher.end()));

        }
        System.out.println("Количество слов латинск.алфавита: "+quan);
    }
}