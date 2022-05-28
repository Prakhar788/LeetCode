/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
      int length(ListNode head){
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        return l;
    }
    
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       	
        int l1=length(headA);
        int l2=length(headB);
    
        int d=0;
        ListNode ptr1;
        ListNode ptr2;
        if(l1>l2){
            d=l1-l2;
            ptr1=headA;
            ptr2=headB;
            
        }
        else{
            d=l2-l1;
            ptr1=headB;
            ptr2=headA;
        }
        while(d!=0){
            ptr1=ptr1.next;
         
            d--;
        }
        while(ptr1!=null && ptr2!=null){
            if(ptr1==ptr2){
                return ptr1;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return null;
	
    }
}





// public class Solution {
    
//         public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
//         ListNode dummy1 = headA;
//         ListNode dummy2 = headB;
        
       
//         while(dummy1 != dummy2){
            
            
//             if(dummy1 != null){
                
//                 dummy1 = dummy1.next;
//             }else{
               
//                 dummy1 = headB;
//             }
//             if(dummy2 != null){
               
//                 dummy2 = dummy2.next;
//             }else{
               
//                 dummy2 = headA;
//             }
//         }
       
//         return dummy2;
//     }
//     }
