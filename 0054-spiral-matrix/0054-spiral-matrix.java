class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int sc = 0;
        int sr = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        while(sr<=er && sc<=ec){
           for(int i=sc;i<=ec;i++){
               ans.add(matrix[sr][i]);
           }
           for(int i=sc+1;i<=er;i++){
               ans.add(matrix[i][ec]);
           }
           for(int i=ec-1;i>=sc;i--){
             if(sr==er){
                break;
            }
           
               ans.add(matrix[er][i]);
           }
           for(int i=er-1;i>=sr+1;i--){
             if(sc==ec){
                break;
            }
               ans.add(matrix[i][sr]);
           }

        sc++;
        sr++;
        ec--;
        er--;

        }
        return ans;
    }
}