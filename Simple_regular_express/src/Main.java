import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*ab");
        Matcher matcher1 = pattern.matcher("d+ab");
        Matcher matcher2 = pattern.matcher("cab");
        Matcher matcher3 = pattern.matcher("ccab");
        Matcher matcher4 = pattern.matcher("cccab");
        test(matcher1); test(matcher2);
        test(matcher3); test(matcher4);
    }
    public static void test(Matcher match) {
        boolean b = match.matches();
        System.out.println(b);
    }
}