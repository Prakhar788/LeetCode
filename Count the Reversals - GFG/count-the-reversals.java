//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        // your code here    
        if(s.length()%2==1){
            return -1;
        }
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
           
            if(ch=='{'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()&&st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
           
        }
        int a=0;int b=0;
            while(!st.isEmpty()){
                if(st.peek()=='{'){
                    b++;
                }
                else{
                    a++;
                }
                st.pop();
            }
            return (a+1)/2+(b+1)/2;
    }
}
