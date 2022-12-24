class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        
        
        int n = arr.length;
		int[] max = new int[n - k + 1];
		Deque<Integer> dq = new LinkedList<>();
		for (int i = 0; i < k; i++) {

			while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.add(i);// last me add krega

		}
		max[0] = arr[dq.getFirst()];// 1st window ka maximum
		int j = 1;
		for (int i = k; i < n; i++) {

			// window i-k tk remove;
			while (!dq.isEmpty() && dq.getFirst() <= i - k) {
				dq.remove();// remove first krega
			}
			while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
				dq.removeLast();// remove first krega
			}
			dq.add(i);// last me add krega

			max[j++] = arr[dq.getFirst()];

		}

		return max;
    }
}

//class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
        
        
//         int i=0, j=0;
//         int size = nums.length;
//         int[] arr = new int[size-k+1];
//         Deque<Integer> deque = new ArrayDeque<>();
        
//         while(j<size){
            
//             while(deque.size()>0 && deque.peekLast()<nums[j]){
//                 deque.pollLast();
//             }
//             deque.offerLast(nums[j]);
            
//             if(j-i+1<k){
//                 j++;
//             }
//             else if(j-i+1 == k){
//                 arr[i]=deque.peekFirst();
//                 if(deque.peekFirst()==nums[i]){
//                     deque.pollFirst();
//                 }
//                 i++;
//                 j++;
//             }
//         }
//         return arr;
//     }
// }
