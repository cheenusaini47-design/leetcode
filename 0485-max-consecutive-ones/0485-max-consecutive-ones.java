class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int res = -1 ;
        int wind = 0;
        
        for(int i = 0; i<nums.length;i++){
            wind += nums[i];
            while(i-left+1 != wind){
              wind -= nums[left];
              left++;
            }
            res = Math.max(res,i-left+1);
        }
        return res;
    }
}