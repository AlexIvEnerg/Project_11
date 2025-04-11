import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String a_text_sent = "Если есть хвосты по дз, начните с 1 не сданного задания." +
                "123 324 111 4554";
        Pattern pattern = Pattern.compile("\\d+\\b");
        Matcher matcher = pattern.matcher(a_text_sent);
        while (matcher.find()) {
            String str = a_text_sent.substring(matcher.start(), matcher.end());
            int n = str.length(); int x = n/2; boolean test = false;
            for (int i=0; i<x; i++) {
                if (str.charAt(i)!=str.charAt(n-1-i)) break;
                else test = true;
            }
            if(test) System.out.println("palindrome: "+str);
        }
    }
}