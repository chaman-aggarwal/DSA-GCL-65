https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> charFrequency = new HashMap<>();
        
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        
        for (int i=0; i<n; i++) {
            if (charFrequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}