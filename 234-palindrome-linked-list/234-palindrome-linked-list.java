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
    public boolean isPalindrome(ListNode head) {
         if(head == null){
            return true;
        }
        
        ListNode mid = middle(head);
        ListNode last = reverse(mid);
        ListNode curr = head;
        while(last != null && curr != null){
            if(last.val != curr.val){
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }
    
   public ListNode reverse(ListNode m){
        ListNode curr = m;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    public ListNode middle(ListNode m){
        ListNode fast = m;
        ListNode slow = m;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}