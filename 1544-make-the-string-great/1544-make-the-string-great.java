class Solution {
    public String makeGood(String s) {
         StringBuilder stack = new  StringBuilder();
        for(Character c :s.toCharArray()){
            char peek = stack.length()>0 ?stack.charAt(stack.length() -1) :'1';
            if(Math.abs(peek -c)==32 && stack.length() >0){

                 stack.deleteCharAt(stack.length() -1);
            }else{
                stack.append(c);
            }
        }
         return stack.toString();
    }
}