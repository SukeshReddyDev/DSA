public class pattern2{
    public static void main(String[] args) {
        pattern15(5);
        pattern16(5);
        pattern17(5);
        
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

    static void pattern16(int n){
        char ch = 'A';
        for(int row = 1;row <= n;row++){
            for(int col = 1 ;col<=row;col++){
                System.out.print(ch+ " ");
            }
            ch++;
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int row = 1; row<=n;row++){
            char ch = 'A';
            int breakpo = ((2*row-1)/2)+1;
            for(int s= 1; s<=n-row;s++){
                System.out.print(" ");
            }
            for(int col = 1;col<=2*row-1;col++){
                if(col<breakpo){
                    System.out.print(ch);
                    ch++;
                }
                else{
                    System.out.print(ch);
                    ch--;

                }


            }
            for(int s= 1; s<=n-row;s++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}