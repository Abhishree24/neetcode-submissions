class Solution {
    public Node pairwiseSwap(Node head) {
        if (head == null || head.next == null)
            return head;

        Node newHead = head.next;
        Node prevTail = null;
        Node curr = head;

        while (curr != null && curr.next != null) {

            Node first = curr;
            Node second = curr.next;
            Node nextPair = second.next;

            // swap
            second.next = first;
            first.next = nextPair;

            // connect with previous pair
            if (prevTail != null) {
                prevTail.next = second;
            }

            prevTail = first;
            curr = nextPair;
        }

        return newHead;
    }
}