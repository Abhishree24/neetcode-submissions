/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        
        Node curr = head;
        Node res = new Node(x);
        if(head == null) return res;
        if(head.data>=x){
            res.next = head;
            head.prev = res;
            return res;
        }
        
        while(curr.next!=null && curr.next.data<x){
            curr=curr.next;
        }
        res.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = res;
        }
        curr.next = res;
        res.prev = curr;
        
        return head;
    }
}