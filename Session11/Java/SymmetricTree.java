https://leetcode.com/problems/symmetric-tree/

class Solution {
    
    boolean symm(TreeNode left, TreeNode right)
    {
        if(left==null || right==null) {
            return left==right;
        }
        else if(left.val!=right.val) {
            return false;
        }
        return symm(left.left, right.right) && symm(left.right, right.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
        {
            return true;
        }
        
        return symm(root.left, root.right);
    }
}