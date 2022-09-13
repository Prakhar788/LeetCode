class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        
        int i=0, j=0;
        int size = nums.length;
        int[] arr = new int[size-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        
        while(j<size){
            
            while(deque.size()>0 && deque.peekLast()<nums[j]){
                deque.pollLast();
            }
            deque.offerLast(nums[j]);
            
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1 == k){
                arr[i]=deque.peekFirst();
                if(deque.peekFirst()==nums[i]){
                    deque.pollFirst();
                }
                i++;
                j++;
            }
        }
        return arr;
    }
}