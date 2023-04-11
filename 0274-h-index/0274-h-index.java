class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h=citations.length;
        for(int i=0;i<h;i++)
        {
            if((h-i)<=citations[i])return h-i;
        }
        return 0;
    }
}