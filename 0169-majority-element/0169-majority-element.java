//MooreVoting Algo
//Rishabh voting algo

class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int ele=0;
       for(int i:nums){
        if(c==0){
            ele=i;
        }
        if(ele==i){
            c++;
        }
        else c--;
    }
        return ele;
 }    
}