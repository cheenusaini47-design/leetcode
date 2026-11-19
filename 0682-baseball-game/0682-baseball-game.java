class Solution {
    public int calPoints(String[] operations) {
        int totalresult = 0 ;
        Stack<Integer> st = new Stack<>();
        for(int index = 0 ;index<operations.length;index++){
            String number = operations[index];
            if(number.equals("+")){
                int v1 = st.pop();
                int v2 = st.pop();
                int onew = v1+v2;
                st.push(v2);
                st.push(v1);
                st.push(onew);

            }else if(number.equals("C")){
                st.pop();

            }else if(number.equals("D")){
                st.push(2*st.peek());

            }else{
                st.push(Integer.parseInt(number));

            }
        }
        while(st.size()>0){
            totalresult += st.pop();
        }


        return totalresult;
    }
}