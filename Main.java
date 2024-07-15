public class Main {
    public static void main(String[] args) {
        InsertRecursiveLL ll = new InsertRecursiveLL();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertFirst(40);
        ll.insertFirst(50);
        ll.display();

        ll.insertRec(25, 3);
        ll.display();

    }
}


