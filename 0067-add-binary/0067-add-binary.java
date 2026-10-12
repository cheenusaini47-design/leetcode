class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();

        if(m>n){
            return addBinary(b,a);
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for(int i = m-1,j=n-1;j>=0;i--,j--){
            int sum = carry;
            if(i>=0&&a.charAt(i)=='1'){
                sum+=1;
                
            }
            if(j>=0&& b.charAt(j)=='1'){
                sum+=1;
            }
            sb.append(sum%2);
            carry = sum/2;


        }
        if(carry == 1){
            sb.append(1);
        }
        sb.reverse();
        return sb.toString();

    }
}