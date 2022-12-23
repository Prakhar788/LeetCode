class Solution {
    public boolean find132pattern(int[] arr) {
     int []min=new int[arr.length];
     min[0]=arr[0];
     for(int i=1;i<min.length;i++){
         min[i]=Math.min(min[i-1],arr[i]);
     }
     Stack <Integer> st =new Stack<>();
     for(int j=arr.length-1;j>=0;j--){
         int th=min[j];
         if(th<arr[j]){
             while(!st.isEmpty()&& arr[st.peek()]<=th){
             st.pop();
             }
             if(!st.isEmpty()&& arr[st.peek()]<arr[j]){
                 return true;
             }
         }
         st.push(j);
     }
     return false;
    }
}