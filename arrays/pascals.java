public class pascals {
    public static void main(String[] args) {
       int row = 5;
       int col = 3;
       long ans = count(row-1,col-1);
       System.out.println(ans);


    }
    // return single element
    static long count(int n , int r){

        long res = 1;
        for(int i=0;i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;

    }


    static void count1(int row){
        int n=row - 1;
        long ans = 1;
        System.out.print(ans+" ");
        for(int i=1;i<=n;i++){
            ans = ans*(n-i+1);
            ans = ans/i;
            System.out.print(ans+" ");
        }
    }
}