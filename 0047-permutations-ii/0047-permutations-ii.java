class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean[]used=new boolean[nums.length];
        finduniquepermutations(nums,result,new ArrayList<>(),used);
        return result;
    }
    private void finduniquepermutations(int[]nums,List<List<Integer>> result,List<Integer>currList,boolean[]used){
        if(currList.size()==nums.length){
            result.add(new ArrayList<>(currList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            currList.add (nums[i]);
            used[i]=true;

            finduniquepermutations(nums,result,currList,used);
            currList.remove(currList.size()-1);
            used[i]=false;
        }
    }
}