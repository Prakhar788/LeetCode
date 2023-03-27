class Solution   {   // Time: O(1) and Space: O(1)
    public int getSum(int a, int b) {
              
        while(b!=0)
        {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
        
    }
}