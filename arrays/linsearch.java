
import java.util.Scanner;
class linsearch{
    public static void main(String[] args) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[a];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int tar = sc.nextInt();
        int ans = search(arr,tar);
        if(ans == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Found at index"+ans);
        }
        
    }
    
    static int search(int[] arr,int tar){
        if(arr.length == 0){
            System.out.println("please enter array");
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]==tar){
               return i;
            }
        }
        return -1;
        
        
        
    }
}