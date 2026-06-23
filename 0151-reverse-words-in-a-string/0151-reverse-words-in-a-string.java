class Solution {
    public String reverseWords(String s) {
        String[]words= s.trim().split(" ");
        StringBuilder result =new StringBuilder();
        for(int j = words.length-1;j>=0;j--){
            if(words[j].equals("")){
                continue;
            }
            result.append(words[j]);
            if(j!=0){
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}