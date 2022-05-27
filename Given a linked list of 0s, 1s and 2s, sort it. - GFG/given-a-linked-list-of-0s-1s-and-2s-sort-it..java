// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }
        Node First=new Node(-1);
         Node zero = First;
        Node Second=new Node(-2);
        Node one = Second;
        Node Third=new Node(-3);
        Node two = Third;
        Node curr=head;
        while(curr!=null){
        if(curr.data==0){
            zero.next=curr;
            zero=zero.next;
        }
        else if(curr.data==1){
            one.next=curr;
            one=one.next;
        }
        else{
            two.next=curr;
            two=two.next;
        }
        curr=curr.next;
        }
        zero.next = (Second.next != null)? (Second.next): (Third.next);
        one.next = Third.next;
        two.next = null;
 
        
        return First.next;  
        
    }
}


