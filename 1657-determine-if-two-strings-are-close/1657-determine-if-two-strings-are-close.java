class Solution {
    public boolean closeStrings(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
       int[] arr1 = new int[26];
       int[] arr2 = new int[26];
       for(int i=0;i<s.length();i++){
        arr1[s.charAt(i)-'a']++;
        arr2[t.charAt(i)-'a']++;
       }
      for(int i=0;i<26;i++){
        if(arr1[i]>0 && !(arr2[i]>0)){
            return false;
        }
      }
      Arrays.sort(arr1);
      Arrays.sort(arr2);  
        return Arrays.equals(arr1,arr2);
    }
}