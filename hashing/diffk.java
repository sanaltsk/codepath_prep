import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class diffk {

    public static int diffPossible(final List<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            map.put(A.get(i),i);
        }
        for(int i=0;i<A.size();i++) {
            if(map.containsKey(A.get(i)+B)) {
                if (map.get(B + A.get(i)) != i) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(diffPossible(Arrays.asList(1,5,3),2));
    }
}
