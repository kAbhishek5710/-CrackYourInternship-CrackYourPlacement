public class LinkedListIntersection {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        ListNode temp = head1;
        int[] arr1 = { 2, 3, 4, 5, 6, 7, 8 };

        for (int el : arr1) {
            temp.next = new ListNode(el);
            temp = temp.next;
        }
        ListNode head2 = new ListNode(9);
        temp = head2;
        temp.next = new ListNode(2);
        temp.next.next = new ListNode(25);
        temp.next.next.next = head1.next.next.next;

        System.out.println("Intersection point : " + getIntersectionNode(head1, head2).val);

    }

    public static ListNode getIntersectionNode(ListNode firstHead, ListNode secondHead) {
        ListNode temp1 = firstHead;
        ListNode temp2 = secondHead;

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

            if (temp1 == temp2)
                return temp1;

            if (temp1 == null) {
                temp1 = secondHead;
            }
            if (temp2 == null) {
                temp2 = firstHead;
            }
        }

        return temp1;
    }
}
