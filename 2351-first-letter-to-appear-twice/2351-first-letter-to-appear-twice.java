class Solution {
    public char repeatedCharacter(String s) {
         Set<Character> hm = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(hm.contains(s.charAt(i))){
                return s.charAt(i);
            }else{
                hm.add(s.charAt(i));
            }
        }
        return 'a';
    }
}