class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

public class AddTwoNumbersInLinkedList {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);
        System.out.println("Number one : ");
        ListNode p1 = head1;
        while(p1 != null){
            System.out.print(p1.val);
            p1 = p1.next;
        }

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);
        ListNode p2 = head2;
        System.out.println();
        while(p2 != null){
            System.out.print(p2.val);
            p2 = p2.next;
        }
        ListNode result = addTwoNumbers(head1, head2);

        System.out.println("\nSum of 243 and 564 would be : " );
        while(result != null){
            System.out.print(result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
