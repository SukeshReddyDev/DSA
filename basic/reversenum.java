public class reversenum{
    public static void main(String[] args) {
        int num = 1453;
        int a = 0;
        while(num>0){
            a=a*10 + num%10;
            num=num / 10;
        }
        System.out.println("After reverse"+a);
    }
}