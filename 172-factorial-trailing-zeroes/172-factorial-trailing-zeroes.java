class Solution {
    public int trailingZeroes(int n) {
   int count=0;
        while(n>4){
            n=n/5;
            count=count+n;
            
        }
        return count;
    }
}