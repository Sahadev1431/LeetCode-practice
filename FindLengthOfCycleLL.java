public class FindLengthOfCycleLL {
    static int lengthOfCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast == slow) {
                int count =  0;
                do {
                    slow = slow.next;
                    count++;
                } while (slow != fast);
                return count;
            }
        }
        return 0;

        // Another way
        // while (fast != slow) {
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }
        // int count = 0;
        // while (slow != fast) {
        //     slow = slow.next;
        //     count++;
        // }
        // return count;
    }
}
