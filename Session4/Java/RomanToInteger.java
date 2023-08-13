https://leetcode.com/problems/roman-to-integer/

class Solution {
    
    int getIntegerValue(char c)
    {
        if(c=='I') {
            return 1;
        }
        else if(c=='V') {
            return 5;
        }
        else if(c=='X') {
            return 10;
        }
        else if(c=='L') {
            return 50;
        }
        else if(c=='C') {
            return 100;
        }
        else if(c=='D') {
            return 500;
        }
        else {
            return 1000;
        }
    }
    
    public int romanToInt(String s) {
        
        int n = s.length();
        int res = 0;
        for(int i=0; i<n; i++) {
            int curr = getIntegerValue(s.charAt(i));
            if(i+1<n) {
                int next = getIntegerValue(s.charAt(i+1));
                if(curr < next) {
                    res += next-curr;
                    i++;
                }
                else {
                    res += curr;
                }
            }
            else {
                res += curr;
            }
        }
        return res;
    }
}