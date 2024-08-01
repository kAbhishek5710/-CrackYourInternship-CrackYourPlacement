public class SortLinkedList0s1s2s {

    static class Node {
        int val;
        Node next;

        public Node(int data) {
            this.val = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        System.out.print("Linked List before Sorting:");
        printList(head);

        head = sortListOptimal(head);

        System.out.print("Linked List after Sorting:");
        printList(head);

    }

    public static Node sortListOptimal(Node head) {
        Node temp = head;
        Node zeroesH = new Node(0);
        Node onesH = new Node(0);
        Node twosH = new Node(0);

        Node tempZero = zeroesH;
        Node tempOnes = onesH;
        Node tempTwos = twosH;

        while (temp != null) {
            if (temp.val == 0) {
                zeroesH.next = temp;
                zeroesH = zeroesH.next;
            } else if (temp.val == 1) {
                onesH.next = temp;
                onesH = onesH.next;
            } else {
                twosH.next = temp;
                twosH = twosH.next;
            }
            temp = temp.next;
        }

        zeroesH.next = (tempOnes.next == null) ? tempTwos.next : tempOnes.next;
        onesH.next = tempTwos.next;
        twosH.next = null;

        return tempZero.next;
    }

    public static void sortListBrute(Node head) {
        Node temp = head;
        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        while (temp != null) {
            if (temp.val == 0) {
                zeroes++;
            } else if (temp.val == 1) {
                ones++;
            } else {
                twos++;
            }

            temp = temp.next;
        }

        temp = head;
        while (zeroes > 0) {
            temp.val = 0;
            temp = temp.next;
            zeroes--;
        }
        while (ones > 0) {
            temp.val = 1;
            temp = temp.next;
            ones--;
        }
        while (twos > 0) {
            temp.val = 2;
            temp = temp.next;
            twos--;
        }
    }

    

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.val);
            node = node.next;
        }
        System.out.println();
    }
}
