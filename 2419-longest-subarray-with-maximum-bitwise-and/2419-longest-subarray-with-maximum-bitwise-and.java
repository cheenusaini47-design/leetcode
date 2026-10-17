class Solution {
    public int longestSubarray(int[] nums) {
        int maxvalue = Integer.MIN_VALUE;
        int maxrange = 0;
        int currrange = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]>maxvalue){
                maxvalue = nums[i];
                maxrange = 1;
                currrange = 1;
            }else if(nums[i]== maxvalue){
                currrange++;
            }else{
                currrange = 0;
            }
            maxrange = Math.max(maxrange,currrange);
        }
        return maxrange;
    }
}