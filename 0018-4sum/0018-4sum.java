class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=(i+1);j<n;j++){
                if(j!=i+1 && nums[j]==nums[j-1])continue;
                int l=j+1;
                int k=n-1;
                while(l<k){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[l];
                    sum+=nums[k];
                    if(sum==target){
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[l], nums[k]);
                        ans.add(quad);
                        l++;
                        k--;
                        while(l<k && nums[k]==nums[k+1])k--;
                        while(l<k && nums[l]==nums[l-1])l++;
                    }
                    else if(sum>target){
                        k--;
                    }
                    else{
                        l++;    
                    }
                    
                    
                }
            }
        }
        return ans;
    }
}