class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans =0;
        for(int i=0;i<n;i++){
            Set<Integer> evens =new HashSet<>();
            Set<Integer> odds= new HashSet<>();
            for(int j=i;j<n;j++){
                int num = nums[j];
                if(num%2==0){
                    evens.add(num);
                }else{
                    odds.add(num);
                }
                if(evens.size()==odds.size()){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}