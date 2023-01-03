class Solution {
    public int[] sortArray(int[] nums) 
    {
        int len = (int)Math.pow(10,5) + 2;
        int sorted[] = new int[len];

        int min = Integer.MAX_VALUE;

        for(int i: nums) min = Math.min(i,min);

        for(int i =0; i< nums.length; i++)
        {
            sorted[nums[i] - min]++;
        }

        int index = 0;
        for(int i = 0; i< len; i++)
        {
            while(sorted[i] > 0)
            {
                nums[index] = i + min;
                sorted[i]--;
                index++;
            }
        }

        return nums;
    }
}