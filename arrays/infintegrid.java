import java.util.ArrayList;
import java.util.Arrays;

public class infintegrid {
    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count=0;
        for(int i=1;i<A.size();i++) {
            int countA=Math.abs(A.get(i)-A.get(i-1));
            int countB=Math.abs(B.get(i)-B.get(i-1));
            count = count + Math.max(countA,countB);
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList a = new ArrayList(Arrays.asList(0,1,2));
        ArrayList b = new ArrayList(Arrays.asList(0,1,3));
        System.out.println(coverPoints(a,b));
    }


}
