package leetcode;
//A peak element is an element that is greater than its neighbors.
//
//Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
//
//The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
//
//You may imagine that num[-1] = num[n] = -∞.
//
//For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
public class FindPeakElement {
	public int findPeakElement(int[] num) {
        int length = num.length;
        return search(num,0,length-1);
    }
	
	private int search(int[] num,int start, int end){
		if(start == end){
			return start;
		}
		if(start+1==end){
			return num[start]>num[end]?start:end;
		}
		int mid = (start + end) / 2;
		if(num[mid] < num[mid-1]){
			return search(num,start,mid-1);
		}
		if(num[mid] < num[mid+1]){
			return search(num,mid+1,end);
		}
		return mid;
	}
}

// regular method
//int m = 0;
//for(int i =1;i<num.length;i++){
//	if(num[i] > num[m]){
//		m = i;
//	}else{
//		return m;
//	}
//}
//return m;