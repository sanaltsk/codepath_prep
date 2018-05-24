public class lengthoflastword {
    public static int lengthOfLastWord(final String A) {
        String B=A;
        B=B.trim();
        int bSpaceIndex = B.lastIndexOf(" ");
        String lastWord = B.substring(bSpaceIndex+1);
        return lastWord.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  xDGBklKecz IAcOJYOH O  WY WPi"));
    }
}
