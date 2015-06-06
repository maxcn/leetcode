package LinkedList;

public class removeNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int size = 0;
        while(head!=null){
            head = head.next;
            size++;
        }
        ListNode prev = dummy;
        ListNode cur = dummy.next;
        for(int i = 0; i < size - n; i++){
            prev = prev.next;
            cur = cur.next;
        }
        prev.next = cur.next;
        return dummy.next;
    }
}
