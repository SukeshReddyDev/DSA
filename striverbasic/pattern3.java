public class pattern3{
    public static void main(String[] args) {
        pattern18(5);
    }

    static void pattern18(int n){
        for(int row = 1;row<=n;row++){
            char ch = (char)('A'+(n-row));
            for(int col = 1;col<=row;col++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }

}