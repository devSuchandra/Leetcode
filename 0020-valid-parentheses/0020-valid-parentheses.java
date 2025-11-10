class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(isOpen(s.charAt(i))){
                st.push(s.charAt(i));
            }else if(st.isEmpty()){
                return false;
            }else if(!st.isEmpty() && !isMatched(st.peek(), s.charAt(i))){
                return false;
            }
            else{
                st.pop();
            }

        }
        return st.isEmpty();
        
    }

    private boolean isOpen(char a){
        return a == '(' || a == '{' || a == '[';
    }
    private boolean isMatched(char b, char c){
        return (b == '(' && c == ')') ||
               (b == '{' && c == '}') ||
               (b == '[' && c == ']');
    }

}