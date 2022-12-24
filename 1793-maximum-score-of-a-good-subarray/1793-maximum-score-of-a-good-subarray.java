class Solution {
   public static int maximumScore(int[] arr, int k) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				
				int r = i;
				int h = arr[st.pop()];
				if (r - 1 >= k) {
					if (!st.isEmpty()) {
						int l = st.peek();
						if (l + 1 <= k) {
							ans = Math.max(ans, h * (r - l - 1));
						}
					}

					else {
						ans = Math.max(ans, h * r);
					}
				}
			}
			st.push(i);

		}

		int r = arr.length;

		while (!st.isEmpty() && r - 1 >= k) {
			// area

			int h = arr[st.pop()];

			if (!st.isEmpty()) {
				int l = st.peek();
				if (l + 1 <= k) {
					ans = Math.max(ans, h * (r - l - 1));
				}
			}

			else {
				ans = Math.max(ans, h * r);
			}

		}
		return ans;
	}

} 
