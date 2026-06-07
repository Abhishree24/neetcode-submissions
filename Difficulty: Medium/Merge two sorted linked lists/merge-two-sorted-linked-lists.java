/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node l1 = head1;
        Node l2= head2;
        Node dummy = new Node(0);
        Node l3= dummy;
        
       while(l1 != null && l2 != null)
       {
            if(l1.data <= l2.data){
                l3.next = new Node(l1.data);
                l1 = l1.next;
            }else{
                l3.next = new Node(l2.data);
                l2 = l2.next;
            }
        
            l3 = l3.next;
        }
        while(l1 != null){
            l3.next = new Node(l1.data);
            l3 = l3.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            l3.next = new Node(l2.data);
            l3 = l3.next;
            l2 = l2.next;
        }
        
        return dummy.next;
    }      
    
    
}