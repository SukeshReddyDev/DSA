import java.util.*;
public class matrixzeros {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] res = zeros(matrix);
        System.out.println(Arrays.deepToString(res));



    }
    static int[][] zeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int col=0;col<n;col++){
                        if(matrix[i][col]!=0){
                            matrix[i][col] = -1;
                        }
                    }
                    for(int row = 0;row<m;row++){
                        if(matrix[row][j]!=0){
                            matrix[row][j] = -1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] =0;
                }
            }
        }
        return matrix;

    }

    //better approach
    static int[][] zeros1(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(col[j]==1 || row[i]==1){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
}