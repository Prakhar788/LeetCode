// { Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new gfg().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/


class gfg {
    
    
    public Node mid(Node head  ){
        
        Node fast = head , slw = head ;
        
        while(fast.next !=null && fast.next.next !=null){
            fast = fast.next.next ;
            slw = slw.next ;
        }
        return slw ;
    } 
    
  public Node reverseList( Node nHead  ){
        
        Node p = null , c = nHead ;
        
        while( c != null ){
            
            Node f = c.next ;
            
            c.next = p ;
            
            p = c ;
            
            c = f;
        }
        return p ;
    }
    
    Node reorderlist(Node head) {
        
        if(head == null || head.next == null) return head ;
        
        Node mid = mid(head);
        
        Node nHead = mid.next ;
        mid.next = null ;
        
        nHead = reverseList(nHead);
        Node c1 = head , c2 = nHead ;
        
        while( c2 !=null ){
            
            Node f1 = c1.next , f2 = c2.next ;
            
            c1.next = c2  ;
            c2.next = f1 ;
            c1 = f1;
            c2 =f2 ;
        }
        return head ;
    }
}