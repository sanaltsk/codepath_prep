package week3;

public class inorder {
    ArrayList<Integer> x = new ArrayList();
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if(A.left!=null){
            inorderTraversal(A.left);
        }
        x.add(A.val);
        if(A.right!=null){
            inorderTraversal(A.right);
        }
        return x;
    }
}
