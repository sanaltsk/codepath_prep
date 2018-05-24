import java.util.ArrayList;
import java.util.Arrays;

public class maxNonNegSubArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList x= new ArrayList();
        ArrayList<ArrayList<Integer>> y = new ArrayList<ArrayList<Integer>>();
        for(int a:A) {
            if(a>=0) {
               x.add(a);
            } else {
                if(x.size()!=0) {
                    y.add(x);
                }
                x=new ArrayList();
            }
        }
        if(x.size()!=0){
            y.add(x);
        }
        long maxSum = -1;
        ArrayList<Integer> z = null;
        for(ArrayList<Integer> i:y){
            long sum=0;
            for(int j:i){
                sum+=j;
            }
            if(sum>maxSum){
                maxSum =sum;
                z=i;
            }
        }
        if(z==null || z.size()==0) {
            return new ArrayList<>();
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println(maxset(new ArrayList<>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368 ))));
    }
}
