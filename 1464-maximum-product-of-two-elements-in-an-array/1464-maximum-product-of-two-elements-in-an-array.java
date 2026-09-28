class Solution {
    public int maxProduct(int[] nums) {
       int sum = 0;
       int ssum = 0;
       for(int num:nums){
        if(sum<num){
            ssum = sum;
            sum = num;
        }else if(ssum<num){
            ssum = num;
        }
       }
       return ( sum-1)*(ssum -1);
        
    }
}