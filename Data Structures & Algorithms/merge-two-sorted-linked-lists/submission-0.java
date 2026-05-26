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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        if(list1 == null) return list2;
         if(list2 == null) return list1;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int x = 0; int y = 0;
        while(curr1 != null && curr2 != null){
            if (curr1 != null)  x = curr1.val;
            if (curr2 != null) y = curr2.val;
            if(x < y)
            {
             tail.next = new ListNode(x);
             tail = tail.next;
             if(curr1 != null) curr1 = curr1.next;
            }
            else if(x > y)
            {
             tail.next = new ListNode(y);
             tail = tail.next;
             if(curr2 != null) curr2 = curr2.next;
            }
            else{
                tail.next = new ListNode(x);
                tail = tail.next;
                tail.next = new ListNode(y);
                tail = tail.next;
                 if(curr1 != null) curr1 = curr1.next;
            if(curr2 != null) curr2 = curr2.next;
            }

        
        }
         if(curr1 != null){
             while(curr1 != null){
                tail.next = new ListNode(curr1.val);
                tail = tail.next;
                if(curr1 != null) curr1 = curr1.next;
           }
         }
            if(curr2 != null){
             while(curr2 != null){
                tail.next = new ListNode(curr2.val);
                tail = tail.next;
                if(curr2 != null) curr2 = curr2.next;
           }
            }

        return dummy.next;
    }
}