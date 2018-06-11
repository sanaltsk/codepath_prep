import java.util.ArrayList;
import java.util.Collections;

public class min_xor {
    static int minxor(ArrayList<Integer> al) {
        Collections.sort(al);
        int minXor = Integer.MAX_VALUE;
        int num=0;
        for(int i=0;i<al.size()-1;i++){
            num = al.get(i)^al.get(i+1);
            minXor = Math.min(minXor,num);
        }
        return minXor;
    }
}
