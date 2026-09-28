class Solution {
    public int numWaterBottles(int nb, int ne) {
        int ans = nb;
        while(nb>=ne){
           int  nnb = nb/ne;;
            int remb = nb%ne;
            ans = ans + nnb;
            nb = nnb+remb;
        }
        return ans;
    }
}