class Solution {
    public int strStr(String a, String b) {
       
        int m = a.length();
        int n = b.length();
         if(m<n){
            return -1;
        }
        for(int i = 0 ; i<=m-n;i++){
            int j = 0 ;
            while(j<n){
                if(a.charAt(i+j)!=b.charAt(j)){
                    break;
                }
                j++;
                 
            }
            if(j==n){
                return i;
            }

        }
        return -1;
        
        
    }
}