public class pattern3{
    public static void main(String[] args) {
        pattern18(5);
        pattern19(5);
        pattern191(5);
        pattern20(5);
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

    static void pattern19(int n){
        for(int row = 1;row<=n;row++){
            for(int col = n;col>=row;col--){
                System.out.print("*");
            }
            for(int s=1;s<=(2*row)-2;s++){
                System.out.print(" ");
            }
            for(int col = n;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern191(int n){
       for(int row = 1;row<=n;row++){
           for(int col =1 ;col<=row;col++){
               System.out.print("*");
           }
           for(int s = 1;s<=((2*n)-(2*row));s++){
               System.out.print(" ");
           }
           for(int col =1 ;col<=row;col++){
               System.out.print("*");
           }
           System.out.println();
       } 
    }

    static void pattern20(int n){
       for(int row = 1;row<=(2*n)-1;row++){
            int col_po = row>n?2*n-row:row;
            int sp =row>n?2*(n-col_po):((2*n)-(2*row));
            for(int col = 1;col<=col_po;col++){
                System.out.print("*");
            }
            for(int s= 1;s<=sp;s++){
                System.out.print(" ");
            }
            for(int col = 1;col<=col_po;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}