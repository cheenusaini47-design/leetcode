class Solution {
    public void reverseStrings(char[] s,int ss ,int e) {
        if(ss>=e){
            return;
        }
        char temp = s[ss];
        s[ss]=s[e];
        s[e]=temp;
        reverseStrings(s,ss+1,e-1);

        
    }
    public void reverseString(char[] s) {
        reverseStrings(s,0,s.length-1);
        
    }
}