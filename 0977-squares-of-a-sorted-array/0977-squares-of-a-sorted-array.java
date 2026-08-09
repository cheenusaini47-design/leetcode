class Solution {
    public int[] sortedSquares(int[] nums) {
    
    for(int i = 0;i<nums.length;i++){
        int  tm = nums[i]*nums[i];
        nums[i] = tm;
    }
    Arrays.sort(nums);
    return nums;
    }
}