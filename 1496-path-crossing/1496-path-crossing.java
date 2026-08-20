class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> sat = new HashSet<>();
        int x=0;
        int y= 0;
        sat.add(0+","+0);
        for(char c : path.toCharArray()){
            if(c=='N'){
                y++;
            }else if(c=='W'){
                x--;
            }else if(c=='S'){
                y--;
            }else if(c=='E'){
                x++;
            }
            String coo = x+","+y;
            if(sat.contains(coo)){
                return true;
            }
            sat.add(coo);
        }
        return false;
    }
}