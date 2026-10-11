class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
         k = k %nums.length;
        int n = nums.length;
        for(int i = 0 ; i<n ;i++){
            arr[(i+k)%n] = nums[i];

        }
        for(int j = 0 ; j<n;j++){
            nums[j] = arr[j];
        }
    }
}