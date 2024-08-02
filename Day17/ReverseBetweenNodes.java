public class ReverseBetweenNodes {

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

        reverseBetween(head, 2, 4);

        System.out.print("After reversal : ");

        temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = temp;
            temp = temp.next;
        }

        ListNode prevTemp = prev;
        ListNode temp1 = temp;

        for (int i = left; i <= right; i++) {
            ListNode next = temp.next;
            temp.next = prevTemp;
            prevTemp = temp;
            temp = next;
        }
        prev.next = prevTemp;
        temp1.next = temp;

        return dummy.next;
    }
}
