class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> sat = new HashSet<>();

        for(int i  : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for( int j : map.values()){
            sat.add(j);
        }
      return map.size()==sat.size()? true:false;
    }
}