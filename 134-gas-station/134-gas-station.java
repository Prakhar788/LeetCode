class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int pos=-1;
       int temp=0;
       int sum=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            temp+=diff;
            sum+=diff;
            if(temp<0){
                pos=i;
                temp=0;
            }
           
            }
         if(sum>=0){
                return pos+1;
        }
        return -1;
    }
}