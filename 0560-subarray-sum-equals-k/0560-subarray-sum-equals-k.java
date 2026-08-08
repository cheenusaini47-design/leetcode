class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int curr = 0;
        Map<Integer,Integer> mapp = new HashMap<>();
        mapp.put(0,1);
        for(int i : nums){
            curr += i;
            res += mapp.getOrDefault(curr-k,0);
            mapp.put(curr,mapp.getOrDefault(curr,0)+1);

        }


        return res;
    }
}