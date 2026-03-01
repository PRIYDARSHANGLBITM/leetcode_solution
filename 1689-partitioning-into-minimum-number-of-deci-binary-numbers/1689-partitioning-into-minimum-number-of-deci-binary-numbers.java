class Solution {
    public int minPartitions(String n) {
        int maxDigit=0;
        for(int i=0;i<n.length();i++){
            char ch = n.charAt(i);
            int currentDigit = ch - '0';
            if(currentDigit>maxDigit){
                maxDigit = currentDigit;
            }
        }
        return maxDigit;
    }
}