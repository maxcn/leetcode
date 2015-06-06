package leetcode;

public class Solution {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test = {{1,2},{3,4},{5,6}};
		RotateImage rt = new RotateImage();
		rt.rotate(test);
		for(int i = 0;i<test.length;i++){
			for(int j=0;j<test[0].length;j++){
				System.out.print(test[i][j]);
			}
			System.out.println();
		}
		
		int a = 3;
		System.out.println(a);
		
	}
	
	

}
