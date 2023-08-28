https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        
        int n = s.size();
        int left = 0, right = 0, maxLen = 0;
        unordered_set<char> charSet;
        
        while(right<n) {
            if(!charSet.count(s[right])) {
                charSet.insert(s[right]);
                maxLen = max(maxLen, right-left+1);
                right++;
            }
            else {
                charSet.erase(s[left]);
                left++;
            }
        }
        
        return maxLen;
    }
};