
import java.util.*;
class Insertion{
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}