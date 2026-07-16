class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result = new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }
    private void backtrack(List<String>result, String curr, int openbracket, int closebracket, int n){
        if (curr.length() == 2*n ){
            result.add(curr);
            return;
        }
        if (openbracket<n){
            backtrack(result,curr+"(",openbracket+1,closebracket,n);
        }
        if(closebracket < openbracket){
            backtrack(result,curr+")",openbracket,closebracket+1,n);
        }
    }
}