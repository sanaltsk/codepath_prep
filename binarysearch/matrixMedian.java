package week3;

public class matrixMedian {
    ArrayList<Integer> al = new ArrayList();
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> x = A.get(i);
            for(int j=0;j<x.size();j++){
                al.add(x.get(j));
            }
        }
        Collections.sort(al);
        int mid = al.size()/2;
        return al.get(mid);
    }
}
