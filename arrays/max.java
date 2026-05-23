import java.util.Scanner;
public class max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[a];
        for(int j=0;j<arr.length;j++){
            arr[j] = sc.nextInt();
        }
        maxArray(arr);
    }
    static void maxArray(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(max);
        
    }
}
