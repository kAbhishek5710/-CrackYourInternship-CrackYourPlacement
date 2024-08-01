
public class DeleteNodesHavingGreaterValue {

    static class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        int[] arr = { 15, 10, 11, 5, 6, 2, 3 };
        Node temp = head;
        for (int el : arr) {
            temp.next = new Node(el);
            temp = temp.next;
        }
        head = compute(head);

        System.out.print("Linked List after deletion : ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static Node compute(Node head) {
        // your code here
        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = head;
        Node prev = dummy;

        while (curr != null) {
            Node temp = curr.next;
            while (temp != null) {
                if (temp.data > curr.data) {
                    prev.next = curr.next;
                    break;
                }
                temp = temp.next;
            }
            if (prev.next != curr.next) {
                prev = curr;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
