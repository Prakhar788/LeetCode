class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
         max=Math.max(max,piles[i]);
      }
        if(piles.length==h){
          return max;
      }  
        int low=0;
        int hi=max;
        int speed=Integer.MAX_VALUE;
        while(low<=hi){
            int sp=low +(hi-low)/2;//to avoid overflow
            if(isPossible(piles,sp,h)==true){
                speed=sp;
                hi=sp-1;
            }
            else{
                low=sp+1;
            }
        }
        return speed;
    }
    public boolean isPossible(int piles[],int sp,int h){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=(int)Math.ceil(piles[i]*1.0/sp);
        }
        return time<=h;
    }
}