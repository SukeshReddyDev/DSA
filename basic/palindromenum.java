public class palindromenum{
    public static void main(String[] args) {
        int num = 121;
        int a = num;
        int rev = 0;
        while(num>0){
            rev = rev * 10 + num%10;
            num = num/10;
        }
        System.out.println(rev);
        if(a==rev){
            System.out.println(a+" is palindrome");
        }
        else{
            System.out.println(a+" is not palindrome");
        }
    }
}

