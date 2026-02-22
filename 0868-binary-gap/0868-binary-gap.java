class Solution {
    public int binaryGap(int n) {
        int index = 0;
        int maxDistance = 0;
        int lastIndex = -1;

        while(n>0){
            if((n&1)==1){
                if(lastIndex !=-1){
                    int distance = index - lastIndex;
                    maxDistance= Math.max(maxDistance,distance);
                }
                lastIndex = index;
            }
            n=n>>1;
            index++;
        }
        return maxDistance;
    }
}