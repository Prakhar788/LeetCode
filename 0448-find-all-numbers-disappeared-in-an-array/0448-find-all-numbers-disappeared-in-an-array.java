//value missing=index+1;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer>list=new ArrayList<>();
    for(int i=0;i<=nums.length-1;i++){
        int n=Math.abs(nums[i]);
        if(nums[n-1]>0){
            nums[n-1]=-1*nums[n-1];
        }
    }
    for(int i=0;i<=nums.length-1;i++){
      if(nums[i]>0){
        list.add(i+1);
      }
    }
        return list;
    }
}