class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans =new ArrayList<>();
     backtrack(nums,0,new ArrayList<Integer>(),ans);
     return ans;
    }
    public void backtrack(int[]nums,int start,List<Integer> track,List<List<Integer>> ans){
        ans.add(new ArrayList<>(track));
        for(int i=start;i<nums.length;i++){
            track.add(nums[i]);
            backtrack(nums,i+1,track,ans);
            track.remove(track.size()-1);            
        }
    }
}