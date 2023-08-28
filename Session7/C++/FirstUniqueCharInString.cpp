https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
public:
    int firstUniqChar(string s) {
        
        unordered_map<char, int> charFrequency;
        
        for (char c : s) {
            charFrequency[c]++;
        }
        
        for (int i=0; i<s.size(); i++) {
            if (charFrequency[s[i]] == 1) {
                return i;
            }
        }
        
        return -1;
    }
};