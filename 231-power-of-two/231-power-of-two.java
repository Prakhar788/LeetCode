class Solution {
    public boolean isPowerOfTwo(int n) {
    
//     if(n==0){
//         return false;
//     }
//         while(n%2==0)n/=2;
//         return n==1;
       // We can achieve this by using x&x-1
        if(n==0)return false;
        long x=(long)n;
        return (x&(x-1))==0;
   
    }
}