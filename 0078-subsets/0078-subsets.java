class Solution {
            List<List<Integer>> res =new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        helper(nums,0,new ArrayList<>());
        return res;
        
    }
    public void helper(int[] nums ,int index ,List<Integer> sublist){
        if(index ==nums.length ){
            res.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[index]);
        helper(nums,index+1,sublist);
        sublist.remove(sublist.size()-1);
           helper(nums,index+1,sublist);

    }
}