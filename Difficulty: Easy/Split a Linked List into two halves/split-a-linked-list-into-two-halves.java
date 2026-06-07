/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

*/

class Solution {
    
    public Pair<Node, Node> splitList(Node head) {
        
    if(head == null)
        return new Pair<Node, Node>(null, null);

    Node curr = head;
    int length = 1;

    while(curr.next != head){
        length++;
        curr = curr.next;
    }

    int firstHalf = (length + 1) / 2;

    Node firstEnd = head;

    for(int i = 1; i < firstHalf; i++){
        firstEnd = firstEnd.next;
    }

    Node head2 = firstEnd.next;

    firstEnd.next = head;
    curr.next = head2;      

    return new Pair<Node, Node>(head, head2);

    }
}