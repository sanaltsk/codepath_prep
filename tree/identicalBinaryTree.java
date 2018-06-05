package week3;

public class identicalBinaryTree {
    public int isSameTree(TreeNode A, TreeNode B) {
        if(A==null && B==null){
            return 1;
        } else if(A==null || B==null){
            return 0;
        }
        if(A.val==B.val){
            boolean x = isSameTree(A.left,B.left) && isSameTree(A.right,B.right);
            if(x) {
                return 1;
            } else {
                return 0;
            }

        }
    }
}
