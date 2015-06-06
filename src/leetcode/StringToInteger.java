package leetcode;

public class StringToInteger {

	public static void main(String[] args) {
		int i = atoi("    544400");
		System.out.println(i);
	}
	
	public static int atoi(String str){
		if(str.length() < 1 || str == null){
			return 0;
		}
		str = str.trim();
		int result = 0;
		boolean isNegative = false;
		int i = 0;
		if(str.charAt(i) == '-'){
			isNegative = true;
			i++;
		}else if(str.charAt(i) == '+'){
		    i++;
		}
		
		while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
		    if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && (str.charAt(i)-'0') > Integer.MAX_VALUE % 10)){
                return isNegative? Integer.MIN_VALUE: Integer.MAX_VALUE;		        
		    }
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}
		return isNegative? result*-1: result;
	}
}
