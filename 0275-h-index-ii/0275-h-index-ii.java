class Solution {
    public int hIndex(int[] citations) {
        int h=citations.length;
        for(int i=0;i<citations.length;i++)
        {
            if((h-i)<=citations[i])return h-i;
        }
        return 0;
    }
}