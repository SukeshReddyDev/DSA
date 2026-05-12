import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        if(num <= 0){
            System.out.println("Invalid input");
        }
        else if(num == 1){
            System.out.println(a);
        }
        else{
            System.out.print(a + " " + b + " ");
            for(int i = 3; i <= num; i++){
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}