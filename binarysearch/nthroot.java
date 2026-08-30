public class nthroot{
    public static void main(String[] args){
       int n = 3;
       int m = 27;
       int ans = nth(n,m);
        System.out.println(ans);
    }

    static int nth(int n,int m){
        for(int i=1;i<=m;i++){
            if(Math.pow(i,n)==m){
                return i;
            }
        }
        return -1;

    }


    //optimal solution


    static int square2(int n,int m){
        int low =1;
        int high = m;
        while(low<=high){
            int mid = low+(high-low)/2;
            int funcn = func(mid,n,m);
            if(funcn == 0){
                return mid;
            }
            else if(funcn==1){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return -1;


    }

    static int func(int mid,int n,int m){
        long result = 1;
        for(int i=1;i<=n;i++){
            result = result * mid;
            if(result > m){
                return 2;
            }
        }
        if(result==m){
            return 0;
        }
        return 1;
    }



}