class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int str = 0;
        int end = mat.length-1;
        for(int i=0;i<mat.length;i++){
            if(str == end ){
                sum-= mat[i][end];

            }
            sum+= mat[i][str] + mat[i][end];
            str++;
            end--;
            
            
            
        }
        return sum;
    }
}