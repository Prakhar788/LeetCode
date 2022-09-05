//Top-Down Naive Approach
// class Solution {
//     public int fib(int n) {
//      if(n<=1){
//          return n;
//      }   
//         if(n==2){
//             return 1;
//         }
//         return fib(n-1)+fib(n-2);
//     }
// }
//Bottom-Up DP Approach
// Bottom-UP Apporach (Optimized)
// Space Complexity: O(1)
// Time Complexity: O(n)

class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int current=0;
        int prev1=1;
        int prev2=1;
        for(int i=3;i<=n;i++){
            current=prev1+prev2;
            prev1=prev2;
            prev2=current;
        }
        return current;
    }
}