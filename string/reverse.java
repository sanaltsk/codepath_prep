import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverse {
    public static String reverseWords(String a) {
        String x[] = a.split("\\s");
        ArrayList y = new ArrayList(Arrays.asList(x));
        Collections.reverse(y);
        String z = String.join(" ",y);
        return z;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
