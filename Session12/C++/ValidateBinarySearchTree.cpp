https://leetcode.com/problems/validate-binary-search-tree/

class Solution {
    
    bool isBST(TreeNode* root, long minV, long maxV)
    {
        if(root==NULL) {
            return true;
        }
        
        if(root->val > minV && root->val < maxV && 
           isBST(root->left, minV, root->val) && 
           isBST(root->right, root->val, maxV)) {
            return true;
        }
        
        return false;
    }
    
public:
    bool isValidBST(TreeNode* root) {
        
        if(!root) {
            return true;
        }
        
        long minV = LONG_MIN;
        long maxV = LONG_MAX;
        
        return isBST(root, minV, maxV);
    }
};