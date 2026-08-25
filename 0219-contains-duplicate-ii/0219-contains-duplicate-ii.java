class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Set<Integer> sat = new HashSet<>();
         for(int i=0;i<nums.length;i++){
            if(sat.contains(nums[i])){
                return true;
            }
            sat.add(nums[i]);
            if(sat.size()>k){
                sat.remove(nums[i-k]);
            }

         }
         return false;
    }
}