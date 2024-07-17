public class PalindromLL_Leet234 {
    static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseLL(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while (second != null) {
            if (first.val != second.val) {
                reverseLL(newHead); 
                return false;
            }
            first = first.next;
            second = second.next; 
        }
        reverseLL(newHead);
        return true;

    }

    static ListNode reverseLL(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode currNode = head;
        ListNode frontNode = head.next;

        while (frontNode != null) {
            currNode.next = prev;
            prev = currNode;
            currNode = frontNode;
            frontNode = frontNode.next;
        }
        currNode.next = prev;
        return currNode;
    }
}

class ListNode {
    int val;
    ListNode next;

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
