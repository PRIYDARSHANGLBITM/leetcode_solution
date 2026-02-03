class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<3){
            return false;
        }
        int i=1;
        while(i<n && nums[i]>nums[i-1]){
            i++;
        }
        if(i==1){
            return false;
        }
        while(i<n && nums[i]<nums[i-1]){
            i++;
        }
        if(i==n|| nums[i-1]>=nums[i-2]){
            return false;
        }
        while(i<n && nums[i]>nums[i-1]){
            i++;
        }
        return i==n;
    }
}