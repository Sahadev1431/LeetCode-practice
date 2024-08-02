public class Add1ToLL_LeetPremium {

    public static Node addOne(Node head) {
		head = reverseLL(head);

        Node temp = head;

        int carry = 1;
        while (temp != null) {
            temp.data += carry;
            if (temp.data < 10) {
                carry = 0;
                break;
            } else {
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;
        }

        if (carry == 1) {
            Node newNode = new Node(carry);
            head = reverseLL(head);
            newNode.next = head;
            return newNode;
        }

        return reverseLL(head);
	}

    private static Node reverseLL(Node head) {
        Node prev = null;
        Node current = head;
        Node front = head.next;
        
        //reverse ll
        while (front != null) {
            current.next = prev;
            prev = current;
            current = front;
            front = front.next;
        }
        current.next = prev;
        return current;
    }
}

class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
      }
}