class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        Map<String,Integer> count = new HashMap<>();

        for(String s : arr1){
            count.put(s,count.getOrDefault(s,0)+1);

        }
        for(String s : arr2){
            count.put(s,count.getOrDefault(s,0)+1);
            
        }
        List<String> liist = new ArrayList<>();
        for(String n : count.keySet()){
            if(count.get(n)==1){
                liist.add(n);
            }
        }
        String[] res = new String[liist.size()];
        int i = 0;
        while(i<liist.size()){
            res[i]= liist.get(i);
            i++;
        }
        return res;
    }
}