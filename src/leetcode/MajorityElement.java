package leetcode;

import java.util.Arrays;

public class MajorityElement {
	public int majorityElement(int[] num){
	      Arrays.sort(num);
	      int len = num.length;
	      return num[len/2];
	}
}

//http://www.ritambhara.in/majority-element-of-an-array-moores-algorithm/