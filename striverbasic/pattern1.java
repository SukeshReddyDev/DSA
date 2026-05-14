public class pattern1{
    public static void main(String[] args) {
        pattern7(5);
        pattern8(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        
    }

    static void pattern7(int n){
         for(int row = 1; row<=n;row++){

            for(int s =1;s<=n-row;s++){
                System.out.print(" ");
            }
            for(int col =1;col<=(2*row)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int row =1;row<=n;row++){

            for(int s=1;s<=row-1;s++){
                System.out.print(" ");
            }

            for(int col = 1; col<=((2*n)-(2*row)+1);col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 9 is combination of both 7 and 8 

    static void pattern10(int n){
        
        for(int row =1;row<=2*n-1;row++){
            int col_to = row>n?(2*n-row):row;
            for(int col = 1; col <=col_to;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    } 

    static void pattern11(int n){
        for(int row = 1; row <=n;row++){
            int digit;
            if(row%2==0){
                digit = 0;
            }
            else{
                digit =1;
            }
            for(int col = 1; col <=row;col++){
                System.out.print(digit+" ");
                digit = 1-digit;
            }
        }
    }

    static void pattern12(int n){

        for(int row = 1; row <= n; row++){

            // Left increasing numbers
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }

            // Spaces
            for(int s = 1; s <= ((2*n) - (2*row)); s++){
                System.out.print(" ");
            }

            // Right decreasing numbers
            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }

            System.out.println();
        }
    }

    static void pattern13(int n){
        int digit = 1;
        for(int row = 1;row <= n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(digit + " ");
                digit ++;
            }
            System.out.println();
        }
    }
}