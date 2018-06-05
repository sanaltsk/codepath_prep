package week3;

public class searchRange {
    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        int l = a.indexOf(b);
        int r = a.lastIndexOf(b);
        ArrayList<Integer> x = new ArrayList();
        x.add(l);
        x.add(r);
        return x;
    }
}
