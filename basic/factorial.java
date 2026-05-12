import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int fac = 1;
        if(num < 0){
            System.out.println("Factorial does not exist for negative numbers");
        }
        else if(num == 0 || num == 1){
            System.out.println("The factorial of the number is 1");
        }
        else{
            for(int i = 2; i <= num; i++){
                fac = fac * i;
            }
            System.out.println("The factorial of number is " + fac);
        }
    }
}