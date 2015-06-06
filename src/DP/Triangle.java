package DP;

//Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
//
//For example, given the following triangle
//[
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
//The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).



import java.util.List;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        if(len == 0) return 0;
        if(len == 1) return triangle.get(0).get(0);
        int[] arr = new int[triangle.get(len-1).size()];
        for(int i = 0; i< triangle.get(len-1).size();i++){
            arr[i] = triangle.get(len-1).get(i);
        }
        for(int level = len - 2;level>=0;level--){
            int col = triangle.get(level).size();
            for(int j = 0;j<col;j++){
                arr[j] = triangle.get(level).get(j) + Math.min(arr[j],arr[j+1]);
            }
        }
        return arr[0];
    }
}
