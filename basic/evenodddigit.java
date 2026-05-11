import java.util.Scanner;
public class evenodddigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        num = Math.abs(num);
        int rem = 0;
        int count_even = 0;
        int count_odd = 0;
        while(num>0){
            rem = num%10;
            if(rem%2==0){
                count_even++;
            }
            else{
                count_odd++;
            }
            num = num/10;
        }
        System.out.println("no of even digits is:"+count_even);
        System.out.println("no of odd digits is:"+count_odd);
        
    }
}