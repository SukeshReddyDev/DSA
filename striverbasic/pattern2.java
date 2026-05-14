public class pattern2{
    public static void main(String[] args) {
        pattern15(5);
        
    }

    static void pattern15(int n){
        char ch = 'A';
        for(int row = 1;row <= n;row++){
            for(int col = n ;col>=row;col--){
                System.out.print(ch+ " ");
                ch ++;
            }
            ch='A';
            System.out.println();
        }
    }
}