class Solution {
    public int[] plusOne(int[] digit) {
       for(int i=digit.length-1;i>=0;i--){
           if(digit[i]<9){
               digit[i]++;
               return digit;
               
           }
           else{
               digit[i]=0;
           }
       } 
        digit=new int[digit.length+1];
        digit[0]=1;
        return digit;
    }
}