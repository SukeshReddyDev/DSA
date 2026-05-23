import java.util.Scanner;
public class min{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[a];
        for(int j=0;j<arr.length;j++){
            arr[j] = sc.nextInt();
        }
        minArray(arr);
    }
    static void minArray(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print(min);
        
    }
}
