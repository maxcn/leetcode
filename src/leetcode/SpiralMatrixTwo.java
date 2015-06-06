package leetcode;

public class SpiralMatrixTwo {

	public static void main(String[] args) {

	}
	
	public int[][] generateMatrix(int n){
		if(n<0){
			return null;
		}
		
		int[][] result = new int[n][n];
		
		int start = 1, x = 0, y =0;
		
		for(int i = n; i > 0 ; i -= 2){
			if(i == 1){
				result[x][y] = start;
			}else{
				for(int j = 0;j<i-1;j++){
					result[x][y++] = start++;
				}
				for(int j = 0;j<i-1;j++){
					result[x++][y] = start++;
				}
				for(int j = 0;j <i-1;j++){
					result[x][y--] = start++; 
				}
				for(int j = 0;j < i-1;j++){
					result[x--][y] = start++;
				}
				x++;
				y++;
			}
		}
		return result;
	}

}
