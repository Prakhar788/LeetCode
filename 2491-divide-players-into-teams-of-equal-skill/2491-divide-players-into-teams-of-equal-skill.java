class Solution {
    public long dividePlayers(int[] s) {
        if(s.length==2)
        {
            return s[0]*s[1];
        }
        int p=0;
        for(int i:s)
        {
            p+=i;
        }
        Arrays.sort(s);
        long m=0;
        int x=s[0]+s[s.length-1];
        for(int i=0;i<s.length/2;i++)
        {
            //System.out.println(s[i]+" "+s[s.length-i-1]);
            if(s[i]+s[s.length-i-1] == x)
                m=m+(s[i]*s[s.length-i-1]);
            else
                return -1;
        }
        return m;
    }
}