class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        long win = 0;
        int kk = k;
        int ids = 2*k+1;
        if(ids>n){
            return res;

        } 
        for(int i = 0; i<ids;i++){
            win += nums[i];
        }
        res[kk]=(int) (win/ ids);
        for(int i = ids;i<n;i++){
            win = win -nums[i-ids]+nums[i];
            res[++k] =(int)(win/ids);
        }
        return res;
    }
}