import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        num = Math.abs(num);
        int temp = num;
        int temp2 = num;
        int count = 0;
        int sum = 0;

        while(temp2 > 0){
            count++;
            temp2 = temp2 / 10;
        }

        while(num > 0){

            int rem = num % 10;

            sum = sum + (int)Math.pow(rem, count);

            num = num / 10;
        }

        if(temp == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}