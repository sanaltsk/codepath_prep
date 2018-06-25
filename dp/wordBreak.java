public class Solution {
    public int wordBreak(String s, ArrayList<String> B) {
        int[] t = new int[s.length() + 1];
        t[0] = 1;
        
        for(int i = 0; i < s.length(); i++){
            if(t[i]==0)
                continue;
            for(String word : B){
                int length = word.length();
                int end = i + length;
                if(end > s.length())
                    continue;
                if(t[end]==1)
                    continue;
                if(s.substring(i, end).equals(word))
                    t[end] = 1;
            }
        }
        return t[s.length()];
    }
}
