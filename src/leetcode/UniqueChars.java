package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "qwertasdfgzxcbyuiophjklvnm";
//		System.out.println(uniqueChars(s));
		char s1 = s.charAt(0);
		int tmp = s1 - 'a';
		int temp = tmp << 1;
		
		System.out.println(tmp); // 16 10000
		System.out.println(temp); //
	}
	
	public static boolean uniqueChars(String s){
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		for(int i = 0; i < chars.length - 1;i++){
			if(chars[i] == chars[i+1]){
				return false;
			}
		}
		return true;	
	}
}

//1 public static boolean isUniqueChars(String str) {
//2 int checker = 0;
//3 for (int i = 0; i < str.length(); ++i) {
//4 int val = str.charAt(i) - ‘a’;
//5 if ((checker & (1 << val)) > 0) return false;
//6 checker |= (1 << val);
//7 }
//8 return true;
//9 }
