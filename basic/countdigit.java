import java.util.Scanner;
public class countdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check:");
        int num = sc.nextInt();
        int count =0;
        num = Math.abs(num);
        if(num==0){
            System.out.println("The no of digits is 1");
        }
        else{
            while(num>0){
            num=num/10;
            count++;
            }
        System.out.println("The no of digits is:"+count);
        }
    }
}