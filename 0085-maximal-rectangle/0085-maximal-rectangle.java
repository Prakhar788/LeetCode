class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] height = new int[n];
        int maxA = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == '1')   height[j] = height[j]+1;
                else    height[j] = 0;
            }
            maxA = Math.max(maxA , maxAreaHisto(height , n));
        }
        return maxA;
    }
    
    public int maxAreaHisto(int[] height , int n){
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        for(int i = 0 ; i <= n ; i++){
            while(!st.isEmpty() && (i == n || height[st.peek()] >= height[i])){
                int ht = height[st.peek()];
                st.pop();
                int width;
                if(st.isEmpty())    width = i;
                else    width = i-st.peek()-1;
                maxA = Math.max(maxA , ht*width);
            }
            st.push(i);
        }
        return maxA;
    }
}