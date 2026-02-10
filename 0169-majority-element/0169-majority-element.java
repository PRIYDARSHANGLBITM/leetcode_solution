class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int diffnum = 0;

        for(int num : nums){
            if(count == 0){
                diffnum = num;
            }
            if(num == diffnum){
                count++;
            }else{
                count--;
            }
        }
        return diffnum;
    }
}