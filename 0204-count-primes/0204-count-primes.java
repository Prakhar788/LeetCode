class Solution {
    public int countPrimes(int n) {
       return check(n); 
    }
    public int check(int n){
      if(n==0||n==1){
          return 0;
      }
     int count=0;
     boolean[]prime=new boolean[n];
     prime[0]=true;
     prime[1]=true;
    for(int i=2;i*i<n;i++){
        if(prime[i]==false){
            for(int mul=2;mul*i<n;mul++){
                prime[i*mul]=true;
            }
        }
    }
    for(int i=2;i<n;i++){
        if(prime[i]==false){
            count++;
        }
    }
        return count;
    }
}