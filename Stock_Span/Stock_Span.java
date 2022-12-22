public static void span(int[] arr) {
		int[] span = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}

			if (st.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - st.peek();
			}
			st.push(i);

		}
		
	}

}
