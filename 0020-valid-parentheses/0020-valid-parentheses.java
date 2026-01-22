class Solution {
    public char getVal(char ch){
        switch(ch){
            case ')': return '(';
            case '}': return '{';
            case ']': return '[';
            default : return ' ';
        }
    }
    public boolean isValid(String s) {
        String opening = "({[";
        String closing = ")}]";

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(opening.indexOf(ch)!= -1){
                st.push(ch);
            }
            else if(closing.indexOf(ch)!=-1){
                if(st.isEmpty())
                return false;

                char tmp=st.pop();
                if(getVal(ch)!=tmp)
                return false;
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
}