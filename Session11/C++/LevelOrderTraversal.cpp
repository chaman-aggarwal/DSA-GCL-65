https://leetcode.com/problems/binary-tree-level-order-traversal/

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        
        if(root==NULL) {
            return {};
        }
        
        queue<TreeNode*> q;
        q.push(root);
        vector<vector<int>> res;
        
        while(!q.empty()) {
            vector<int> level;
            int n=q.size(); 
            for(int i=0; i<n; i++) {
                TreeNode* node=q.front();
                q.pop();
                level.push_back(node->val);
                if(node->left) {
                    q.push(node->left);
                }
                if(node->right) {
                    q.push(node->right);
                }       
            }
            res.push_back(level);
        }
        
        return res;
    }
};