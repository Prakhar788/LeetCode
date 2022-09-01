/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         int low=1;
//         int high=n;
//       int ans=0;
//         while(low<=high){
//         int mid=low+(high-low)/2;
//         if(isBadVersion(mid)){
//             ans=mid;
//             high=mid-1;
//         }
//         else{
//             low=mid+1;
//         }
       
//         }
//          return ans;
//     }
    
// }

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1 ;
        int end = n;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid) == true && isBadVersion(mid-1) == false)
                return mid;
            else if(isBadVersion(mid) == false)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}