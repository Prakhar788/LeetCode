class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1){
             return 1;
        }
      // int count[]=new int[n+1];
      //   for(int [] p:trust){
      //       count[p[0]]--;
      //       count[p[1]]++;
      //   }
      //   for(int i=0;i<count.length;i++){
      //       if(count[i]==n-1)return i;
      //   }
      //   return -1;
            int trustedBy[]=new int[n+1];
             int trusts[]=new int[n+1];
            
            for(int []rel:trust){
                trusts[rel[0]]++;
                trustedBy[rel[1]]++;
                
            }
            for(int i=1;i<n+1;i++){
                if(trusts[i]==0 && trustedBy[i]==n-1){
                    return i;
                }
            }
            return -1;
    }
}