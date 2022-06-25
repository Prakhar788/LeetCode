/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        return mergeSort(head);

    }
    
    public ListNode mergeSort(ListNode head)
    {
        
        if(head == null || head.next == null)
            return head;
        
        
        ListNode mid = findMid(head); // find Mid as we do in array
        
        ListNode left = head; // breaking linkedList in two part left and right left head will **head**
        ListNode right = mid.next;  //right LinkedList head will mid.next
        mid.next = null;  // and mid.next to break the LinkedList in two half part(left and right)
        
        left = mergeSort(left);  // recursive call for dividing LinkedList as we do in Divide and Conquer method
        right = mergeSort(right); // same dividing here the right part
        
        ListNode res = merge(left,right);   // and finally merging the divided LinkedList
        
        return res; // and return 
    }
    
    public ListNode findMid(ListNode head)
    {
        ListNode f = head.next;
        ListNode s = head;
        while(f!=null && f.next!=null)
        {
            f = f.next.next;
            s = s.next;
        }
        
        return s;
    }
    
    public ListNode merge(ListNode left, ListNode right)
    {
        ListNode newNode = new ListNode(-1); // dummy node for making new LinkedList
        ListNode head = newNode; //  make that d
        
		
		//merge the LinkedList as we merge in array concept
        while(left!=null && right!=null)
        {
            if(left.val <= right.val)
            {
                newNode.next = left;
                newNode = newNode.next;
                left = left.next;
            }
            else
            {
                newNode.next = right;
                newNode = newNode.next;
                right = right.next;
            }
        }
        
        while(left!=null)
        {
                newNode.next = left;
                newNode = newNode.next;
                left = left.next;
        }
        
        while(right!=null)
        {
                newNode.next = right;
                newNode = newNode.next;
                right = right.next;
        }
        // at last return the head.next becouse the head was the dummy Node.
        return head.next;
    }
}