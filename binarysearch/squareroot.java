public class squareroot{
    public static void main(String[] args){
       int n = 1;
       int ans = square(n);
        System.out.println(ans);
    }

    static int square(int n){
        int ans = 1;
        if(n==0){
            return 0;
        }
        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans = i;
            }else{
                break;
            }
        }
        return ans;

    }

    //Optimal approach

    static int square2(int n){
        int ans = 1;
        if(n==0){
            return 0;
        }
        int low = 1;
        int high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((long)mid*mid<=n){
                ans=mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;

    }


}