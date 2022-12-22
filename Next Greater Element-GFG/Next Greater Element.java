
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long nums[]=new long[arr.length];
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
               int j=st.pop();
               nums[j]=arr[i];
                //Nge
            }
            st.push(i);
        }
         while(!st.isEmpty()){
               int j=st.pop();
               nums[j]=-1;
                
            }
            return nums;
    } 
}
