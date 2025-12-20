class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freqArr[] = new int [101];
        int maxFreq=0;
        int sumFreq=0;
        for(int i:nums){
            freqArr[i]++;
            int curFreq = freqArr[i];
            if(curFreq>maxFreq){
                maxFreq=curFreq;
                sumFreq=curFreq;
            }else if (curFreq == maxFreq){
                sumFreq +=curFreq;
            }
        }
        return sumFreq;
    }
}