// using temp variable

/*public class swapnumbers{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping:"+"a:"+a+"B:"+b);
    }
}
*/

//Without third variable

public class swapnumbers{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:"+"a:"+a+"B:"+b);
    }
}