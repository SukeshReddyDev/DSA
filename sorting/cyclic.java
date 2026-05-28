
import java.util.*;
class Cyclic{
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}