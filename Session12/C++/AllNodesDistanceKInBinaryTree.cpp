https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

class Solution {  
    
    void buildParents(unordered_map<TreeNode*, TreeNode*>& parents, TreeNode* root)
    {
        if(root==NULL) {
            return;
        }
        if(root->left!=NULL) {
            parents[root->left] = root;
            buildParents(parents, root->left);
        }
        if(root->right!=NULL) {
            parents[root->right] = root;
            buildParents(parents, root->right);
        }
    }
    
public:
    vector<int> distanceK(TreeNode* root, TreeNode* target, int k) {
        
        unordered_map<TreeNode*, TreeNode*> parents;
        buildParents(parents, root);
        
        unordered_set<TreeNode*> visited;
        queue<TreeNode*> q;
        q.push(target);
        vector<int> res;
        
        while(!q.empty() && k>=0) {
            int levelSize = q.size();
            while(levelSize--) {
                TreeNode* curr = q.front();
                q.pop();
                visited.insert(curr);
                
                if(k==0) {
                    res.push_back(curr->val);
                    continue;
                }
                
                // check for left and right child which are not visited
                if(curr->left && !visited.count(curr->left)) {
                    q.push(curr->left);
                }
                if(curr->right && !visited.count(curr->right)) {
                    q.push(curr->right);
                }
                
                // check for unvisited parent
                if(parents.count(curr) && !visited.count(parents[curr])) {
                    q.push(parents[curr]);
                }
            }
            k--;
        }
        return res;
    }
};