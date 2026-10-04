class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0 ;
        int d = 0;
        while(i<arr.length){
            if(arr[i]==0){
                if(d<arr.length){
                   ans[d] = 0;

                }
                d++;
                if(d<arr.length){
                   ans[d] = 0;

                }

            }else{
                if(d<arr.length){
                   ans[d] = arr[i];

                }
            }
            d++;
            i++;

        }
        
        
        for(int w=0;w<arr.length;w++){
            arr[w]=ans[w];
        }
    }
}