class Solution {
    public String convertToTitle(int CN) {
        StringBuilder result=new StringBuilder();
        while(CN>0){
            CN--;
            int remainder= CN%26;
            char ch =(char)('A'+remainder);
            result.append(ch);
            CN=CN/26;
        }
        return result.reverse().toString();
    }
}