class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      if (k <= 1) return 0;
          int ans=0,i=0,j=0,p=1;
        while(j<nums.length){
            p*=nums[j];
            while(p>=k){
                p/=nums[i++];  
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}
// class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         if (k <= 1) return 0;
//         int prod = 1, ans = 0, left = 0;
//         for (int right = 0; right < nums.length; right++) {
//             prod *= nums[right];
//             while (prod >= k) prod /= nums[left++];
//             ans += right - left + 1;
//         }
//         return ans;
//     }
// }