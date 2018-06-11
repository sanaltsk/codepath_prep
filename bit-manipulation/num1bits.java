public class num1bits {

    public static  int numSetBits(long a) {
        int count=0;
        String x = Long.toBinaryString(a);
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSetBits(11));
    }
}
