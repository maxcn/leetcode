package leetcode;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * Some hints: Could negative integers be palindromes? (ie, -1)
 * 
 * If you are thinking of converting the integer to string, note the restriction
 * of using extra space.
 * 
 * You could also try reversing an integer. However, if you have solved the
 * problem "Reverse Integer", you know that the reversed integer might overflow.
 * How would you handle such case?
 * 
 * There is a more generic way of solving this problem.
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPalindrome(9999))
			System.out.println("Ok");
	}
	
	public static boolean isPalindrome(int x) {
		if(x < 0){
			return false;
		}
		int k = 1;
		while(x / k >= 10){
			k = k * 10;
		}
		while(x >= 10){
			int left = x / k ;
			int right = x - x / 10 * 10;
			if(left != right){
				return false;
			}
			x = (x - x / k * k) / 10;
			k = k / 100;
		}
		//1000021 
		if(x!=0 && k > x){
            return false;
        } 
		return true;
    }

}
