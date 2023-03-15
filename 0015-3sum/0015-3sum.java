class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums==null || nums.length<3){
            return list;
        }
        Arrays.sort(nums);for(int i=0 ; i<nums.length-2 ; i++){
            if(i ==0 || (i>0 && nums[i] != nums[i-1]) ){
                int ans =0- nums[i];
                int low = i+1;
                int high = nums.length-1;
                while(low < high){
                       if(nums[low] + nums[high] == ans){
            list.add(Arrays.asList(nums[i], nums[low] ,nums[high]));
               while( nums[low] == nums[low+1] && low < nums.length-2 ) low++;
               while(nums[high] == nums[high-1] && high>1) high--;
               low++ ;
               high--;
                 }else{
                        if(nums[low]+nums[high] < ans){
                            low++;
                        }else  high--;
                 }
                }
                
            }
        }
        return list;
    }
}