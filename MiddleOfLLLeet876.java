public class MiddleOfLLLeet876 {

    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next;
        }
        return s;
    }
}