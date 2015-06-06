package DP;

//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
//the contiguous subarray [4,−1,2,1] has the largest sum = 6.

public class MaximumSubArray {
	public int maxSubArray(int[] A){
		int carry = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < A.length;i++){
			carry += A[i];
			if(carry > 0){
				max = Math.max(carry, max);
			}else{
			    max = Math.max(carry, max);
				carry = 0;
			}
		}
		return max;
	}
}
