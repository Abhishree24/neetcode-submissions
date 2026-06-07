/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        Node equalNode = new Node(0);
        Node lessNode = new Node(0);
        Node moreNode = new Node(0);
        
        Node equal = equalNode;
        Node less = lessNode;
        Node more = moreNode;
        
        Node curr = head;
        while(curr!= null){
            if(x <curr.data){
                more.next = curr;
                more = more.next;
            }
            else if(x > curr.data){
                less.next = curr;
                less = less.next;
            }
            else{
                equal.next = curr;
                equal = equal.next;
            }
            curr= curr.next;
        }
        more.next = null;
        equal.next = moreNode.next;
        less.next = equalNode.next;
        
        
         Node newHead = lessNode.next;

        return newHead;
    }
};