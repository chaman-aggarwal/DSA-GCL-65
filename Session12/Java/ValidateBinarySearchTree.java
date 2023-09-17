https://leetcode.com/problems/validate-binary-search-tree/

class Solution {
    
    boolean isBST(TreeNode root, long minV, long maxV)
    {
        if(root==null) {
            return true;
        }
        
        if(root.val > minV && root.val < maxV && 
           isBST(root.left, minV, root.val) && 
           isBST(root.right, root.val, maxV)) {
            return true;
        }
        
        return false;
    }
    
    public boolean isValidBST(TreeNode root) {
        
        if(root==null) {
            return true;
        }
        
        long minV = Long.MIN_VALUE;
        long maxV = Long.MAX_VALUE;
        
        return isBST(root, minV, maxV);
    }
}