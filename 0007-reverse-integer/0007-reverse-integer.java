class Solution {
    public int reverse(int x) {
        int revInt = 0;
        while(x != 0){
            int d = x % 10;     
            if(revInt > Integer.MAX_VALUE/10 || revInt < Integer.MIN_VALUE/10){
                return 0;
            }
            revInt  = (revInt * 10) + d;
            x /= 10;
        }
        return revInt;
    }
}
