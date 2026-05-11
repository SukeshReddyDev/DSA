import java.util.Scanner;
public class primenumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();
        int count = 0;
        if(num == 1){
            System.out.println("1 is neither prime nor composite");
        }
        else if(num > 1){
            for(int i = 2; i <= Math.sqrt(num); i++){

                if(num % i == 0){
                    count = count + 1;
                }
            }

            if(count == 2){
                System.out.println(num + " is prime number");
            }
            else{
                System.out.println(num + " is not prime number");
            }
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}