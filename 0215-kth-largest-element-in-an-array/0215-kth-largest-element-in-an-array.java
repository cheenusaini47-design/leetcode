class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pd = new PriorityQueue<>();
        for( int val : nums){
            pd.add(val);
            if(pd.size()>k){
                pd.remove();
            }
        }
        return pd.peek();
    }
}