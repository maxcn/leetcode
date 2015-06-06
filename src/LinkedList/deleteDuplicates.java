package LinkedList;

public class deleteDuplicates {

	public static void main(String[] args) {

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null){
            if(prev.val == cur.val){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }

}
