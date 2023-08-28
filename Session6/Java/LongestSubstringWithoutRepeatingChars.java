https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int left = 0, right = 0, maxLen = 0;
        Set<Character> charSet = new HashSet<>();
        
        while(right<n) {
            if(!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLen = Math.max(maxLen, right-left+1);
                right++;
            }
            else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLen;
    }
}