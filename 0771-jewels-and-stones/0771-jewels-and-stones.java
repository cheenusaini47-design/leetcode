import java.util.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> sat = new HashSet<>();
        int ans = 0;
        for( char ar:jewels.toCharArray()){
            sat.add(ar);
        }
        for( char ar:stones.toCharArray()){
            if(sat.contains(ar)){
                ans++;
            }
        }
       return ans;
    }
}