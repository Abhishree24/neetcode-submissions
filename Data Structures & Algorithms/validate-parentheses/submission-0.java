class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if (n%2 != 0){
            return false;
        }

        else{
            for(int i=0;i<n/2;i++){
                st.push(s.charAt(i));
            }

            for(int i=(n/2);i<n;i++){
                char c = st.pop();
                if(c == '{' && s.charAt(i) == '}') continue;
                else if(c == '(' && s.charAt(i) == ')') continue;
                else if(c == '[' && s.charAt(i) == ']') continue;
                else return false;
                
            }
        }
            return true;
    }
}
