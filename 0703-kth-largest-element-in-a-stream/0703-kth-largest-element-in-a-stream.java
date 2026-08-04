class KthLargest {
PriorityQueue<Integer> pd = new PriorityQueue<>();
int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num :nums){
            pd.add(num);
            if(pd.size()>k){
                pd.poll();
            }
        }
    }
    
    public int add(int val) {
        if(pd.size()<k || val > pd.peek()){
            pd.offer(val); 
            
            if(pd.size()>k){
                pd.poll();
            }
         }
        
          return pd.peek();
        
         
    }
    
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */