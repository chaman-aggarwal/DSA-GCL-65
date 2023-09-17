https://leetcode.com/problems/insert-into-a-binary-search-tree/

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root==null) {
            return new TreeNode(val);
        }
        else if(root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }
        else {
            root.right = insertIntoBST(root.right, val);
        }
        
        return root;
        
    }
}