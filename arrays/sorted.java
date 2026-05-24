import java.util.Scanner;
class sorted{
    public static void main(String[] args) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[a];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sortArray(arr);
    }

    static void sortArray(int[] arr){
        boolean sort = true;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sort = false;
            }
        }
        if(sort){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
        
    }
}