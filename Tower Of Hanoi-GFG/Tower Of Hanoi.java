class Hanoi {
   

   public long toh(int n, int from, int to, int aux) {
       
       if(n<=0) return 0;


       long x = toh(n-1,from,aux,to);


       System.out.println("move disk "+n+" from rod "+from+" to rod "+        to);
       long y = toh(n-1,aux,to,from);
       
       return x+y+1; 
   }
}
