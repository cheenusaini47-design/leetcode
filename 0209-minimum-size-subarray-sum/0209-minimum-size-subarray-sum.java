class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0 ; 
        int n = nums.length;
        
        int win = 0;
        int res = n+1;
        for( int r=0;r<nums.length;r++){
            win +=  nums[r];
             while(win>=target){
            res = Math.min(res,r-l+1);
            win -= nums[l++];
        }
        }
        
        return res == n + 1? 0: res;
    }
}