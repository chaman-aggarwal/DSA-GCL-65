https://leetcode.com/problems/symmetric-tree/

class Solution {
    
    bool isSymm(TreeNode* left, TreeNode* right)
    {
        if(left==NULL || right==NULL) {
            return left==right;
        }
        else if(left->val!=right->val) {
            return false;
        }
        return isSymm(left->left, right->right) && isSymm(left->right, right->left);
    }
    
public:
    bool isSymmetric(TreeNode* root) {
        
        return isSymm(root->left, root->right);   
    }
};