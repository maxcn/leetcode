package leetcode;

//Given two binary strings, return their sum (also a binary string).
//
//For example,
//a = "11"
//b = "1"
//Return "100".


public class AddBinary {
	public String addBinary(String a, String b){
		if(a == null || b == null)
			return null;
		if(a.length() == 0)
			return b;
		if(b.length() == 0)
			return a;
		
		StringBuffer sb = new StringBuffer();
		
		int la = a.length() - 1;
		int lb = b.length() - 1;
		
		int carry = 0; 
		while(la >= 0 || lb >= 0){
			int sum = carry;
			if(la>=0)
				sum += (a.charAt(la) - '0');
			if(lb>=0)
				sum += (b.charAt(lb) - '0');
			
			char c = sum % 2 == 1 ? '1' : '0';
			sb.insert(0, c);
			carry = sum / 2;
			
			la--;
			lb--;
		}
		
		if(carry ==1){
			sb.insert(0, '1');
		}
		
		return sb.toString();
	}
}
