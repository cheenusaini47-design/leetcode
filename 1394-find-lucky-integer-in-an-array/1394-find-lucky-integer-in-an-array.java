class Solution {
    public int findLucky(int[] arr) {
         Map<Integer,Integer> map = new HashMap<>();
         int max = -1;
         int res = -1;
          for(int i  : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j : arr){
            if(j== map.get(j) && map.containsKey(j)){
               res= map.get(j);
                 max = Math.max(max,res);
            }
            
           
        }
        return max;
    }
}