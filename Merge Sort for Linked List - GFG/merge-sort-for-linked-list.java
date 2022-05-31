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
		   
		      head = new Solution().mergeSort(head);
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
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
   //Function to sort the given linked list using Merge Sort.
   static Node mergeSort(Node head)
   {
       if(head == null || head.next == null){
           return head;
       }
       Node middle = getMiddle(head);
       
       
       Node part1 = head;
       Node part2 = middle.next;
       middle.next = null;
       part1 = mergeSort(part1);
      
       part2 = mergeSort(part2);
       head = merge(part1,part2);
       return head;
      
   }
   static Node getMiddle(Node head){
       Node slow = head;
       Node fast = head;
       while(fast.next!=null && fast.next.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
   }
  static Node merge(Node h1, Node h2){
      if(h1 == null){
          return h2;
      }
      if(h2 == null){
          return h1;
      }


       Node head,tail;
       if(h1.data<=h2.data){
           head = h1;
           tail = h1;
           h1 = h1.next;
           
       }else{
           head = h2;
           tail = h2;
           h2 = h2.next;
       }
       while (h1!=null && h2!=null){
           if(h1.data<= h2.data){
               tail.next = h1;
               h1 = h1.next;
               tail = tail.next;
           }else{
               tail.next = h2;
               h2 = h2.next;
               tail = tail.next;
       }
       }
       if(h1!=null){
           tail.next = h1;
       }else{
           tail.next = h2;
       }
   

return head;
}
}




