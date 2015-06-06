package LinkedList;

public class partition {
	public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode last = dummy;
        int n = 0;
        while(last.next != null){
            last = last.next;
            n ++;
        }
        while(n > 0){
            if(dummy.next.val < x){
                dummy = dummy.next;
            }else{
                last.next = new ListNode(dummy.next.val);
                last = last.next;
                dummy.next = dummy.next.next;
            }
            n--;
        }
        return head.next;
    }
}
