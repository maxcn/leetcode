package leetcode;
//Given two binary trees, write a function to check if they are equal or not.
//
//Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null){
        	return true;
        }else if(p!=null && q ==null){
            return false;
        }else if(p==null&& q!=null){
            return false;
        }
        boolean test1 = false;
        if(p.val == q.val){
        	test1 = true;
        }
        boolean test2= isSameTree(p.left,q.left);
        boolean test3 = isSameTree(p.right,q.right);
        return test1 && test2 && test3;        
    }
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val = x;
		}
	}
}
