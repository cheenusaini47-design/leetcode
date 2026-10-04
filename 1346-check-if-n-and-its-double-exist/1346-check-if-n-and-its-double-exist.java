class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> sat = new HashSet<>();
        for(int num:arr){
            if(sat.contains(num*2)||sat.contains(num/2)&& num%2==0){
                return true;
            }
            sat.add(num);
        }
            
        return false;
    }
}