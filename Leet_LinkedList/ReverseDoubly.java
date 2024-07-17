public class ReverseDoubly {
    static ListNode reverseDoubly (ListNode head) {
        ListNode prev = null;
        ListNode currNode = head;
        while (currNode != null) {
            prev = currNode.prev;
            currNode.prev = currNode.next;
            currNode.next = prev;
            currNode = currNode.prev;
        }
        return prev.prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode prev;
 
    ListNode() {
    }
 
    ListNode(int val) {
       this.val = val;
    }
 
    ListNode(int val, ListNode next) {
       this.val = val;
       this.next = next;
    }
 }