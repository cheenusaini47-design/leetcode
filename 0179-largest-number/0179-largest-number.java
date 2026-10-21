class Solution {
    public String largestNumber(int[] nums) {
        String[] res = new String[nums.length];
        int i= 0;
        for(int num :nums){
            res[i]= Integer.toString(num);
            i++;

        }
        Arrays.sort(res,(a,b) ->(b+a).compareTo(a+b));
        if( res[0].equals("0")){
            return "0";
        }
        StringBuilder ss= new StringBuilder();

        for(String s: res){
            ss.append(s);
        }
        return ss.toString();


    }
}      