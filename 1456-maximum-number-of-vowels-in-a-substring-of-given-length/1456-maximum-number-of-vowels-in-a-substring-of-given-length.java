class Solution {
    public int maxVowels(String s, int k) {
        int res=0;
        int l =0;
        int r=0;
        int win = 0;
        for(;r<k;r++){
            win += isvowel(s.charAt(r));
        }
        res = win;
        while(r<s.length()){
            win -= isvowel(s.charAt(l++));
             win += isvowel(s.charAt(r++));
             res = Math.max(res,win);
        }
        return res;
    }
    public int isvowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')? 1:0;
    }
}