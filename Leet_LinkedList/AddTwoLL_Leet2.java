public class AddTwoLL_Leet2 {

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode();
        ListNode current = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
            }
            if (l2 != null) {
                sum += l2.val;
            }
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            current.next = newNode;
            current = newNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }
        return dummyNode.next;
    }
}

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }