class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        
        if (head1 == null || head2 == null) return null;

        HashSet<Integer> hs = new HashSet<>();

        // Store elements of first list
        Node curr = head1;
        while (curr != null) {
            hs.add(curr.data);
            curr = curr.next;
        }

        // Dummy node for result list
        Node dummy = new Node(0);
        Node tail = dummy;

        // Traverse second list
        Node curr1 = head2;
        while (curr1 != null) {
            if (hs.contains(curr1.data)) {
                tail.next = new Node(curr1.data);
                tail = tail.next;   // move tail forward
            }
            curr1 = curr1.next;
        }

        return dummy.next;
    }
}