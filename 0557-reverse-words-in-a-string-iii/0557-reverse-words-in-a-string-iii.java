class Solution {
     public void rev(char[] arr ,int i ,int j){
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
            

        }
    public String reverseWords(String s) {
       
        char[] arr = s.toCharArray();
        int st = 0 ;
        int e = 0;
        while(st<arr.length){
            while(e<arr.length && arr[e]!=' '){
                e++;
            }
            rev(arr,st,e-1);
            st=e+1;
            e= e+1;

        }
        return new String(arr);
    }
}