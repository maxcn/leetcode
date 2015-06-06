package leetcode;

public class RotateImage {
	public void rotate(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length ==0)
			return;
		int n = matrix.length;
		int top  = 0;
		int left = 0;
		int down = n - 1;
		int right = n - 1;
		
		
		while(n > 1){
			
			
			for(int i =0; i < n-1;i++){
				int temp = matrix[top][left + i];
				
				//replace top with left;
				matrix[top][left + i] = matrix[down - i][left];
				//replace left with bottom;
				matrix[down - i][left] = matrix[down][right - i];
				//replace bottom with right;
				matrix[down][right - i] = matrix[top + i][right];
				//replace right with top
				matrix[top + i][right] = temp;
			}
			
			top ++;
			left ++;
			right --;
			down --;
			
			n -=2;
			
		}

	}
}
