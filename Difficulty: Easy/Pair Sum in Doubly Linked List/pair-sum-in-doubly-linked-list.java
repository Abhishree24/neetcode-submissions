/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    
    
    Node start = head;
    Node end = head;
    while(end.next != null){
        end = end.next;
    }
    
    while(start.data<end.data){
        int val = start.data+end.data;
        if(val == target){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(start.data);
            arr.add(end.data);
            res.add(arr);
            start= start.next;
            end=end.prev;
        }
        else if(val<target){
            start=start.next;
        }
        else{
            end = end.prev;
        }
        
        
    }
    return res;
    }
}
