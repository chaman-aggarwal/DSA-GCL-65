https://leetcode.com/problems/generate-parentheses/

class Solution {        
    
    void parenthesis(vector<string>&res, string& curr, int n, int open, int close)
    {
        if(curr.size()==n*2)
        {
            res.push_back(curr);
            return;
        }
        
        if(open<n)
        {
            curr.push_back('(');
            parenthesis(res, curr, n, open+1, close);
            curr.pop_back();
        }
        
        if(close < open)
        {
            curr.push_back(')');
            parenthesis(res, curr, n, open, close+1);
            curr.pop_back();
        }
        
    }
    
public:
    vector<string> generateParenthesis(int n) {
        
        vector<string> res;
        string curr="";
        
        parenthesis(res, curr, n, 0, 0);
        
        return res;
        
    }
};