package leetcode;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
        char[] charArray = s.toCharArray();
        int sum =0;
        int count = 0;
        for(int i = charArray.length -1; i>=0;i--){
            sum += (charArray[i] - 'A' + 1) * Math.pow(26,count);
            count++;
        }
        return sum;
    }
}
