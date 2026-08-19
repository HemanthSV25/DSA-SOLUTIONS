class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int sc=0;
        for(char c:s.toCharArray()){
            if(c=='('){
               st.push(sc);
               sc=0;
            }
            else{
                int prev=st.pop();
                if(sc==0){
                    sc=1;
                }
                else{
                    sc=2*sc;
                }
                sc=prev+sc;
            }
        }
        return sc;
    }
}