public class RemoveNodes {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        int[] arr = {2,6,3,4,5,6};
        for(int el: arr) {
            temp.next = new ListNode(el);
            temp = temp.next;
        }

        temp = head;

        System.out.print("Before removal : ");
        printList(temp);

        head = removeElements(head, 6);

        System.out.print("After removal : ");
        printList(temp);

        
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode curr = head;
        ListNode prev = temp;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return temp.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(" " + node.val);
            node = node.next;
        }
        System.out.println();
    }
}
