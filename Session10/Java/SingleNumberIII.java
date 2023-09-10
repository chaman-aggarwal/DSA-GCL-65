https://leetcode.com/problems/single-number-iii/

class Solution {
    public int[] singleNumber(int[] nums) {
        
        int n = nums.length;
        int res = 0;
        for(int num:nums) {
            res ^= num;
        }

        int pos = 0; 
        while((res & 1)!=1) {
            pos++;
            res = res>>1;
        }
        
        int mask = 1<<pos;
        int num1 = 0, num2 = 0;
        
        for(int num:nums) {
            if((num & mask) > 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        int answer[] = {num1, num2};
        return answer;
    }
}