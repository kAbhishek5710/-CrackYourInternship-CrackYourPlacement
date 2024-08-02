public class AddTwoNumsII {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(7);
        ListNode temp = head1;
        temp.next = new ListNode(2);
        temp.next.next = new ListNode(4);
        temp.next.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        temp = head2;
        temp.next = new ListNode(6);
        temp.next.next = new ListNode(4);

        ListNode newHead = addTwoNumbers(head1, head2);

        System.out.print("Added Numbers : ");
        temp = newHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode head = new ListNode(0);
        ListNode temp = head;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int quot = 0;

        while (temp1 != null || temp2 != null) {
            int sum = quot;
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            quot = sum / 10;
            int rem = sum % 10;
            temp.next = new ListNode(rem);
            temp = temp.next;
        }

        if (quot > 0) {
            temp.next = new ListNode(quot);
        }

        head = reverseList(head.next);

        return head;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
