class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for (int num:nums){//enhanced for loop
            result= result^num;//xor kar de sabhi number ka
        }
        return result;
    }
}