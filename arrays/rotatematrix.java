import java.util.*;
public class rotatematrix{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] res = rotatematrix(matrix);
        System.out.println(Arrays.deepToString(res));
        int[][] res1 = rotatematrix(matrix);
        System.out.println(Arrays.deepToString(res1));



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

    // oPTIMAL APPROACH
    static int[][] rotatematrix1(int[][] matrix) {
       int n = matrix.length;
       for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
       for(int i=0;i<n;i++){
           int left =0;
           int right = n-1;
           while(left < right){
               int temp = matrix[i][left];
               matrix[i][left] = matrix[i][right];
               matrix[i][right] = temp;
               left++;
               right--;
           }
       }
       return matrix;

    }
}