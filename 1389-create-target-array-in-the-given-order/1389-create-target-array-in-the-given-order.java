class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       int ans[]=new int [nums.length];
    // take arraylist of integer
    ArrayList<Integer> list=new ArrayList<>();
    
    //add element at their index
    for(int i=0;i<nums.length;i++)
    {
       list.add(index[i],nums[i]);
    }
    //copy element from list to ans array
    for(int i=0;i<nums.length;i++)
    {
        ans[i]=list.get(i);
    }
    return ans;
}
}   
    