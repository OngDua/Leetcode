import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalTraverse {
    // 1,1   1,2   2,1   3,1 2,2 1,3
    public int[] findDiagonalOrder(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int index = 0;
        int[] array = new int[]{};
        int i = 0, j = 0;

        //start
        while(){
            array[index] = mat[i][j];
            index++;
            if((i + j) % 2 == 0){
                if(isValid(i - 1, j + 1, m, n)){
                    i = i-1;
                    j = j+1;
                }else{
                    if(isValid(i, j + 1, m, n)){
                        //Go right
                        j = j+1;
                    }else if(isValid(i + 1, j, m, n)){
                        //go down

                    }
                    
                }
            }



            if((i+j) % 2 == 0 && isValid(i - 1, j+ 1, m, n)){
                i = i-1;
                j = j+1;
            }else if((i+j) % 2 == 1 && isValid(i + 1, j - 1, m, n)){
                i = i + 1;
                j = j -1;
            }else if((i + j) % 2 == 0){
                if(isValid(i, j + 1, m, n)){
                    //Go right

                }
            }



            if((i+j) % 2 == 0){// go to upper right element
                while(isValid(i-1, j+1, m, n)){
                    i = i-1;
                    j = j+1;
                    array[index]
                }
            }
            while()
        }
        
    }
    public static boolean isValid(int i,int j,int m, int n){
        if(i >= 0 && i < m && j >=0 && j < n){
            return true;
        }
        return false;
    }
}
