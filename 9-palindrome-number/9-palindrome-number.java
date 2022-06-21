class Solution {
    public boolean isPalindrome(int n) {
       if(n>=0){
          return n==rev(n);   
       }
        else
        {
            return false;
        }
    }
    
    public static int rev(int n) {
        int digits=(int)(Math.log10(n))+1;
        return rev2(n,digits);
        
    }

    private static int rev2(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+rev2(n/10, digits-1);
    }
}