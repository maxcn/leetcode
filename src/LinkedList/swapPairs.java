package LinkedList;

public class swapPairs {
	public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode first = head;
        ListNode second = new ListNode(0);
        if(first != null){
            second = first.next;
        }
        while(first != null && second != null){
            ListNode temp = second.next;
            prev.next = second; //1
            second.next = first; // 2 
            prev = first; // 3
            first.next = temp; // 4
            if(temp != null){ 
                first = temp;  //5
                second = temp.next;
            }else{
                break;
            }
        }
        return dummy.next;
    }
}
