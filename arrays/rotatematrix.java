import java.util.*;
public class rotatematrix{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] res = rotatematrix(matrix);
        System.out.println(Arrays.deepToString(res));



    }
    static int[][] rotatematrix(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][(n-1)-i] = matrix[i][j];
            }
        }
        return ans;

    }
}