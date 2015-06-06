package LinkedList;

//Assume before entering the loop, there are k steps
//loop has n nodes;
//slow one step each time, fast two steps each time
//when slow entering the loop, fast has already had k steps inside the loop
//to let slow meet fast, (2t+k) % n == t % n in which t is the 
//time they spent(t starts when slow entering the loop);
//when t = n - k, they meet
//we set slow to the beginning point, and let fast move one step each time, after k step//
//they meet the at starting point, 

public class detectCycle {
	public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(true){
            if(slow.next != null){
                slow = slow.next;
            }
            if(fast.next != null && fast.next.next != null){
                fast = fast.next.next;
            }else{
                return null;
            }
            if(fast == slow){
                slow = head;
                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
    }
}
