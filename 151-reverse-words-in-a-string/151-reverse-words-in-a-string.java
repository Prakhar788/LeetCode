class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int n = array.length - 1;
        for (int i = 0; i <= n; i++) {
            if (!array[i].isEmpty()) {
                sb.insert(0, array[i]);
                if (i < n) {
                    sb.insert(0, " ");
                }
            }
        }
        return sb.toString();
    }
}