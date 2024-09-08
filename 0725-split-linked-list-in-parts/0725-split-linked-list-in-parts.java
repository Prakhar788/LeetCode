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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int linkedListLength = 0;
        ListNode temp = head;
        while(temp != null) {
            linkedListLength++;
            temp = temp.next;
        }
        int partLength = linkedListLength / k;
        int extraNodes = linkedListLength % k;
        ListNode[] arr = new ListNode[k];
        temp = head;
        ListNode prev = null;
        for(int i = 0; i < arr.length && temp != null; i++, extraNodes--) {
            arr[i] = temp;
            for(int j = 0; j < partLength + (extraNodes > 0 ? 1 : 0) && temp != null; j++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
        }
        return arr;
    }
}