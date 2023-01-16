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
            int mid=low +(hi-low)/2;//to avoid overflow
            if(isPossible(piles,mid,h)==true){
                speed=mid;
                hi=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return speed;
    }
    public boolean isPossible(int piles[],int mid,int h){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=(int)Math.ceil(piles[i]*1.0/mid);
        }
        return time<=h;
    }
}