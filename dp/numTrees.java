public class Solution {

    public static int numTrees(int a) {
        if(a < 0)
            return 0;
        int[] count = new int[a+1];
        count[0] = 1;
        count[1] = 1;
        for(int i = 2; i <= a; i++){
            //int n = i - 1;;
            for(int j = 0; j <= i-1; j++){
                count[i] += count[j] * count[i - j - 1];
               // n--;
            }
                
        }
        return count[a];
    }

}
