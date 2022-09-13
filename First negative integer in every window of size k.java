class Compute {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
   {
       ArrayList<Long> ans = new ArrayList<>();
       Queue<Long> q= new ArrayDeque<>();
       int i=0;
       int j=0;
       while( j < N)
       {
           if(A[j] < 0)
           {
               q.add(A[j]);
           }
            if((j-i +1)  < K)
           {
               j++;
           }
           else if((j-i+1) == K)
           {
               if(q.size() ==0)
               {
                   ans.add((long)0);
               }
               else{
                   ans.add(q.peek());
               }
                   if(!q.isEmpty() && A[i] == q.peek())
                   {
                       q.poll();
                   }
               
               i++;
               j++;
           }
       }
       long answer[]= new long[ans.size()];
       for(int k=0;k<ans.size();k++)
       {
           answer[k]= ans.get(k);
       }
       return answer;
   }
   
}

// Points to Ponder:

// Create an ArrayList in which we will store the answer.
// We will use a queue to keep track of the negative elements.
// Create two pointers start and end as i and j
// the end pointer will run till the end of the given array
// Keep on adding the negative elements to the QUEUE
// Till our window attains a size of K keep on increasing the end pointer and once it attains a size of K, maintain the Size.
// If the window size is K check is the size of queue is 0, & if the size of queue is 0 it means that in that window size no element is negative. So add “0” to the ans vector.
// If the size of queue is not 0, it means the first negative element will be stored at the FRONT of out queue. So add that in out answer vector.
// Now when we create a new window we have to remove the negative element of the previous window.
// Keep on checking if the Array element is equal to the Front element of the queue, if it is equal remove it.
// Keep on sliding the window by start++(i++) and end++(j++).
// At last create a answer array and store elements of ans vector in the array and return it.
 
