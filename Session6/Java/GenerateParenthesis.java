https://leetcode.com/problems/generate-parentheses/

class Solution {
    
    void parenthesis(int n, String curr, int open, int close, List<String> res)
    {
        if(curr.length()==2*n)
        {
            res.add(curr);
            return;
        }

        if(open<n)
        {
            parenthesis(n, curr+'(', open+1, close, res);
        }
        if(close<open)
        {
            parenthesis(n, curr+')', open, close+1, res);
        }
        
    }
    
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<String>();
        parenthesis(n, "", 0, 0, res);
        return res;
        
    }
}