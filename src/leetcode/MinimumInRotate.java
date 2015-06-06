package leetcode;
//Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//Find the minimum element.
//
//You may assume no duplicate exists in the array.
public class MinimumInRotate {
	public int findMin(int[] num) {
		int low  = 0;
		int high = num.length - 1;
		while(num[low] > num[high]){
			int mid = (high + low) / 2;
			if(num[low] < num[mid]){
				low = mid;
			}else if(num[low]==num[mid]){
			    if(num[mid]<num[mid+1]){
			        return num[mid];
			    }else{
			        return num[mid+1];
			    }
			}else{
				high = mid;
			}
		}
		return num[low];
	}
}


//or min = Integer.MAX_VALUE + for loop solve