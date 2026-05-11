import java.util.Scanner;
public class largestof3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        
        //using comparision operators
        /* if(a>b && a>c){
            System.out.println(a+" is greater");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
        */

       // using ternary operator
        int largest1 = a>b?a:b;
        int largest2 = c>largest1?c:largest1;
        System.out.println(largest2+" is greater");
        
    }
}
