import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[a];
        for(int j=0;j<arr.length;j++){
            arr[j] = sc.nextInt();
        }
        revArray(arr);
    }
    static void revArray(int[] arr){
        int[] rev = new int[arr.length];
        int k = 0;
        for(int j =arr.length-1;j>=0;j--){
            rev[k] = arr[j];
            k++;
        }
        for(int i = 0;i<rev.length;i++){
            System.out.print(rev[i] + " ");
        }
        
        
    }
}
