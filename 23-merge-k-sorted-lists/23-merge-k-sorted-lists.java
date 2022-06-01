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
  public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        return divideAndSort(0,lists.length-1,lists);
    }
    
    private ListNode divideAndSort(int i,int j,ListNode[] lists){
        if(i==j) return lists[i];
        int mid=i+(j-i)/2;
        ListNode list1=divideAndSort(i,mid,lists);
        ListNode list2=divideAndSort(mid+1,j,lists);
        return mergeTwoLists(list1,list2);
        
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null ) return list2;
        if (list2 == null) return list1;
        ListNode l1,l2;
        if(list1.val<=list2.val) {
            l1=list1;
            l2=list2;
        }
        else {
            l1=list2;
            l2=list1;
        }
        ListNode res=l1;
        ListNode temp =l1;
        
        while (l1!=null || l2!=null) {
            if(l1==null) {
                temp.next=l2;
                break;
            }
            if(l2==null) {
                temp.next=l1;
                break;
            }
            if(l1.val<=l2.val){
                temp=l1;
                l1=l1.next;
            }else{
                temp.next=l2;
                temp=l2;
                l2=l1;
                l1=temp;
            }
        }
        return res;
    }
}