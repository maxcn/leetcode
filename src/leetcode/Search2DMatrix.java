package leetcode;

public class Search2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[2][1];
		matrix[0][0] = 1;
		matrix[1][0] = 3;
		System.out.println(searchMatrix(matrix,1));
	}

	public static boolean searchMatrix(int[][] matrix,int target){
        int row = matrix.length;
		int col = matrix[0].length;
		
		int rlow = 0;
		int rhigh = row ;
		int rmid = 0;
		while(rhigh > rlow){
			rmid = (rlow+rhigh) / 2;
			if(target > matrix[rmid][col-1]){
				rlow = rmid + 1;
			}else if(target < matrix[rmid][0]){
				rhigh = rmid ;
			}else if(target == matrix[rmid][col-1] || target == matrix[rmid][0]){
			    return true;
			}else{
				int clow = 0;
				int chigh = col;
				int cmid = 0;
				while(clow<chigh){
					cmid = (clow+chigh) / 2;
					if(target > matrix[rmid][cmid]){
						clow = cmid + 1;
					}else if(target<matrix[rmid][cmid]){
						chigh = cmid ;
					}else{
						return true;
					}
				}
				break;
			}
		}
		return false;	
	}
}
