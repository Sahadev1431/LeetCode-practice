public class ReverseLinkedList206 {
   static ListNode reverseList(ListNode head) {
      if (head == null || head.next == null) {
         return head;
      }
      ListNode prev = null;
      ListNode temp = head;
      ListNode front = head.next;

      while (front != null) {
         temp.next = prev;
         prev = temp;
         temp = front;
         front = front.next;
      }
      temp.next = prev;
      return temp;
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