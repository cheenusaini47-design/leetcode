class Solution {
    public int heightChecker(int[] heights) {
        Integer[] res = new Integer[heights.length];
        int m= heights.length;

        for(int i= 0;i<m;i++){
            res[i]= heights[i];

        }
        Arrays.sort(res);
        int count = 0;
        for(int i= 0;i<m;i++){
            if(res[i]!= heights[i]){
                count++;
            }
        }
        return count;
    }
}