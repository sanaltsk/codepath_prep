import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class palindrome {

    public static int isPalindrome(String A) {
        A=A.replaceAll("[^A-Za-z0-9]","");
        A = A.toLowerCase();
        String B = new StringBuilder(A).reverse().toString();
        return A.equals(B)?1:0;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
