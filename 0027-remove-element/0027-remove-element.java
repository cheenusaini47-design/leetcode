class Solution {
    public int removeElement(int[] nums, int val) {
        int prt = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[prt]= nums[i];
                prt++;
            }
        }
        return prt;
    }
}