class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int res = 0;
        int left = 0;
        int sum = 0;
        Set<Integer> sat = new HashSet<>();
        for(int right =0;right<nums.length;right++){
            while(sat.contains(nums[right])){
                sat.remove(nums[left]);
                sum-= nums[left];
                left++;

            }
            sat.add(nums[right]);
            sum+=nums[right];
            res = Math.max(res,sum);
        }
        return res;
    }
}