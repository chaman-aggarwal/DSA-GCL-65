https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

class Solution {
    
    void buildParents(Map<TreeNode, TreeNode> hm, TreeNode root)
    {
        if(root == null) return;
        if(root.left != null)
            hm.put(root.left, root);
        
        if(root.right != null)
            hm.put(root.right, root);
    
        buildParents(hm, root.left);
        buildParents(hm, root.right);
        return;
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        buildParents(parentMap, root);

        List<Integer> res= new ArrayList<>();
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        
        while(!q.isEmpty() && K>=0){
            int size= q.size();
            for(int i =0; i <size; i++){
                TreeNode curr = q.poll();
                visited.add(curr);
                if(K == 0){
                  res.add(curr.val);
                  continue;
                }
                if(parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))){
                    q.add(parentMap.get(curr));
                }
                if(curr.left != null && !visited.contains(curr.left)){
                    q.add(curr.left);      
                }
                if(curr.right != null && !visited.contains(curr.right)){
                    q.add(curr.right);      
                }
            }
            K--;
        }
        return res;
    }
}