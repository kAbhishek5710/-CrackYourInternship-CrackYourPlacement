public class RemoveKthNodefromEnd {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next = new ListNode(2);
        temp.next.next = new ListNode(3);
        temp.next.next.next = new ListNode(4);
        temp.next.next.next.next = new ListNode(5);

        removeNthFromEnd(head, 2);

        System.out.print("After deletion : ");

        temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int K) {
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int ndPt = size - K;

        if (ndPt == 0) {
            return head.next;
        }

        int i = 1;
        temp = head;
        while (i++ < ndPt) {
            temp = temp.next;
        }

        temp.next = (temp.next == null) ? null : temp.next.next;

        return head;

    }
}
