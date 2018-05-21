import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagram {
    public static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();

        for(int i=0; i<A.size();i++){
            char[] temp = A.get(i).toCharArray();
            Arrays.sort(temp);
            String res = String.valueOf(temp);
            if(map.get(res) == null) {
                ArrayList<Integer> index = new ArrayList<Integer>();
                index.add(i+1);
                map.put(res,index);
            } else {
                map.get(res).add(i + 1);
            }
        }

        for(ArrayList<Integer> t : map.values()){
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(anagrams(Arrays.asList("cat","dog","god","tca")));
    }
}
