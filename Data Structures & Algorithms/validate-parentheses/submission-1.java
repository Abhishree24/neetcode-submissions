class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if (n%2 != 0){
            return false;
        }

        else{
            for(int i=0;i<n;i++){
                char m = s.charAt(i);
                if(m == '(' || m == '{' || m == '[') st.push(m);
                // if(m == ')' || m == '}' || m == ']') st.pop();
                else if(m == '}' && st.pop() == '{') continue;
                else if(m == ')' && st.pop() == '(') continue;
                else if(m == ']' && st.pop() == '[') continue;
                else return false;
                
            }
        }
            return true;
    }
}
