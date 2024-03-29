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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head==null)
//             return head;
//         ListNode prev=null;
//         ListNode temp=head;
//         ListNode next=temp.next;
//         while(temp!=null)
//         {
//             temp.next=prev;
//             prev=temp;
//             temp=next;
//             if(next!=null)
//             {
//                 next=next.next;
//             }
//         }
//         head=prev;
//         return head;
//     }
// }
class Solution {
    public ListNode reverseList(ListNode head) {
      if(head==null){
          return null;
      }
        else if(head.next==null){
            return head;
        }
        else{
           ListNode nextNode=head.next;
            head.next=null;
            ListNode rest=reverseList(nextNode);
            nextNode.next=head;
            return rest;
        }
    }
}