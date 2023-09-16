https://leetcode.com/problems/binary-tree-right-side-view/

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>(); 
        
        if(root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int n = queue.size();
            for(int i=1;i<=n;i++) {
                TreeNode curr = queue.poll();
                if(i==n) {
                    result.add(curr.val);   
                }
                if(curr.left!=null) {
                    queue.add(curr.left);
                }
                if(curr.right!=null) {
                    queue.add(curr.right);
                }
            }
        }
        
        return result;
    }
}