public class Solution {
    public static ArrayList<Integer> stepnum(int a, int b) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(isStepNum(i)){
                al.add(i);
            }
        }
        return al;
    }

    private static boolean isStepNum(int n) {
        char s[] = (n+"").toCharArray();
        for(int i=1;i<s.length;i++){
            int x = (int) s[i-1];
            int y = (int) s[i];
            if(Math.abs(x-y)!=1) {
                return false;
            }
        }
        return true;
    }
}
