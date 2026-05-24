import java.util.Scanner;
class count{
    public static void main(String[] args) {
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[a];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        countEvenOdd(arr);
    }

    static void countEvenOdd(int[] arr){
        int even = 0;
        int odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Count of even is " + even);
        System.out.println("Count of odd is " + odd);
    }
}