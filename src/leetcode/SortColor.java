package leetcode;

public class SortColor {
    public void sortColors(int[] A) {
        
        int r = 0;
        int w = 0;
        int b = 0;
        for(int i = 0;i < A.length; i++){
            if(A[i] == 0)
                r++;
            if(A[i] == 1)
                w++;
            if(A[i] == 2)
                b++;
        }
        for(int i = 0;i < r;i++){
            A[i] = 0;
        }
        for(int i=0;i<w;i++){
            A[r+i] = 1;
        }
        for(int i = 0;i<b;i++){
            A[r+w+i] = 2;
           
        }
    }
}
