public class Solution {
    public static int canJump(ArrayList<Integer> a) {
        if(a == null || a.size() == 0)
            return 0;
        if(a.size() == 1)
            return 1;
        
        int result = 0;
        int[] canReach = new int[a.size()];
        for(int i = a.size() -2, dist = 1; i >= 0; i--, dist++){
            if(a.get(i) >= dist){
                canReach[i] = 1;
            }
            else{
                int j = 1;
                while(j <= a.get(i) && canReach[i+j] != 1){
                    ++j;
                }
                if(j <= a.get(i))
                    canReach[i] = 1;
            }
        }
        return canReach[0];
    }
    
    public static int canJumpDP(ArrayList<Integer> a) {
        int next = a.size() - 1;
        
        for(int i = a.size() - 2; i >= 0; i--){
            if(a.get(i) >= next - i)
                next = i;            
        }
        return next == 0 ? 1 : 0;
    }
}
