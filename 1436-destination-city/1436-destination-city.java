class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> sat = new HashSet<>();
        for(List<String> arr : paths){
           sat.add(arr.get(0));
        }
        for(List<String> arr : paths){
           if(!sat.contains(arr.get(1))){
            return arr.get(1);
           }
        }
        return null;

    }
}