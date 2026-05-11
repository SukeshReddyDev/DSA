import java.util.Scanner;
public class sumofdigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        num=Math.abs(num);
        int rem = 0;
        int sum = 0;
        while(num>0){
            rem = num % 10;
            num = num/10;
            sum = sum + rem;
        }
        System.out.println("The sum of digits is : "+ sum);
    }
}