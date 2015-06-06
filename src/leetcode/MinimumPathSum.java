package leetcode;

public class MinimumPathSum {

	public static void main(String[] args) {

	}
	
	public int minPathSum(int[][] grid){
		int row = grid.length;
		int col = grid[0].length;
		
		int[][] res = new int[row][col];
		
		//initialization
		res[0][0] = grid[0][0];
		
		//left 
		for(int i = 1;i < row;i++){
			res[i][0] = grid[i][0] + res[i-1][0];
		}
		
		//top
		for(int i = 1;i < col;i++){
			res[0][i] = grid[0][i] + res[0][i-1];
		}
		
		//rest
		for(int i = 1;i<row;i++){
			for(int j = 1;j<col;j++){
				res[i][j] = grid[i][j] + Math.min(res[i-1][j], res[i][j-1]);
			}
		}
		
		return res[row-1][col-1];
	}

}
