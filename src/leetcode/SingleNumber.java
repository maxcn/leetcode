package leetcode;

public class SingleNumber {
	public int SingleNumber(int[] A){
		int length = A.length;
		if(length == 0)
			return -1;
		if(length == 1)
			return A[0];
		int single = 0;
		for(int i = 0; i < length; i++){
			single ^= A[i];
		}
		return single;
	}
}


//int unique = A[0];
//for(int i = 1;i<A.length;i++){
//    unique ^= A[i];
//}
//return unique;