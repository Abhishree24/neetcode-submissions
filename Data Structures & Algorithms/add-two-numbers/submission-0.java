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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        // one can be null, both can be null
        //one can be small other can be bigger
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
       int carry = 0;
       int left = 0;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
       while(curr1 !=null || curr2 !=null){
        int x = (curr1!=null)?curr1.val:0;
         int y = (curr2!=null)?curr2.val:0;
        int data = carry + x +y;
        carry = data/10;
        left = data%10;
         tail.next = new ListNode(left);
            tail = tail.next;
       if (curr1 != null) {
                curr1 = curr1.next;
            }

            if (curr2 != null) {
                curr2 = curr2.next;
            }
       }

       if(carry > 0){
    tail.next = new ListNode(carry);
}
        return dummy.next;

    }
}