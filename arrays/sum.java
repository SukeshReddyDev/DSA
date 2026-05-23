import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");
        int[] arr = new int[5];
        for(int j=0;j<arr.length;j++){
            arr[j] = sc.nextInt();
        }
        sumArray(arr);
    }
    static void sumArray(int[] arr){
        int s =0;
        for(int num : arr){
            s=s+num;
        }
        System.out.println(s);
    }
}
