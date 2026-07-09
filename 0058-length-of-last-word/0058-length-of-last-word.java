class Solution {
    public int lengthOfLastWord(String p) {
        int count = 0;
        for(int i=p.length()-1; i>=0;i--){
            if(p.charAt(i) != ' '){
                count++;
            }
            else{
                if(count>0)
                return count;
            }
        }
        return count;
    }
}