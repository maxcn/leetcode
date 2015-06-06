package LinkedList;

public class sortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int n = 0;
        while(head!=null){
        	n++;
        	head=head.next;
        }
        TreeNode root = new TreeNode(0);
        
    }
	
	public void insert(TreeNode node){
		
	}
}
