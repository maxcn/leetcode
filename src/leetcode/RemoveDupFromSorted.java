package leetcode;

public class RemoveDupFromSorted {
	public int removeDuplicates(int[] A) {
        int p = 0;
        if(A.length ==1){
            p =1;
        }
        for(int i = 1; i < A.length;i++){
            if(A[i] > A[i-1]){
                A[p++] = A[i-1];
            }
            if(i==A.length-1)
                A[p++] = A[i];
        }
        return p;
	}
}
