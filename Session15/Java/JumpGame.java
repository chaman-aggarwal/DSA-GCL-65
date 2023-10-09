https://leetcode.com/problems/jump-game/

class Solution {
    public boolean canJump(int[] nums) {
        
        int maxReach = 0;
        int n = nums.length;
        
        for(int i=0; i<n; i++)
        {
            if(i > maxReach)
            {
                return false;
            }
            if(maxReach >= n-1)
            {
                return true;
            }
            maxReach = Math.max(maxReach, i+nums[i]);
        }
        
        return true;
        
    }
}