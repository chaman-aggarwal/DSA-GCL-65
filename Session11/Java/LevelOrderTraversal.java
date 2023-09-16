https://leetcode.com/problems/binary-tree-level-order-traversal/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
       
        if(root == null) {
            return result;
        }
       
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.add(root);
       
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>(); 
            int n = queue.size();
            for(int i=0;i<n;i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left!=null) {
                    queue.add(node.left);
                }
                if(node.right!=null) {
                    queue.add(node.right);
                }
            }
            result.add(level);
        }
        
        return result;
    }
}