class Solution
{
  
    int maxPathSum(int ar1[], int ar2[])
    {
        int sum1=0,sum2=0;
        int m=ar1.length;
        int n=ar2.length;
        int i=0,j=0,result=0;
        while(i<m && j<n){
            if(ar1[i]<ar2[j]){
                sum1+=ar1[i++];
            }
            else if(ar2[j]<ar1[i]){
                sum2+=ar2[j++];
            }
            else{
                result+=Math.max(sum1,sum2)+ar1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<m){
            sum1+=ar1[i++];
        }
        while(j<n){
            sum2+=ar2[j++];
        }
        result+=Math.max(sum1,sum2);
        return result;
    }
}
