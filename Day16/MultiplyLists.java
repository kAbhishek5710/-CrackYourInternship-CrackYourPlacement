public class MultiplyLists {

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node temp = first;
        temp.next = new Node(0);
        temp.next.next = new Node(0);
        temp.next.next.next = new Node(0);
        Node second = new Node(1);
        temp = second;
        temp.next = new Node(0);

        System.err.println(multiplyTwoLists(first, second));
    }

    public static long multiplyTwoLists(Node first, Node second) {
        // Code here
        long MOD = 1000000007;

        // Convert first linked list to number
        long num1 = 0;
        Node temp = first;
        while (temp != null) {
            num1 = (num1 * 10 + temp.data) % MOD;
            temp = temp.next;
        }

        // Convert second linked list to number
        long num2 = 0;
        temp = second;
        while (temp != null) {
            num2 = (num2 * 10 + temp.data) % MOD;
            temp = temp.next;
        }

        // Multiply the two numbers and take modulo
        return (num1 * num2) % MOD;
    }
}
