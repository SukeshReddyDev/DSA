public class kthmissing{
    public static void main(String[] args){
       int[] nums = {1,4,6,8,9};
       int k = 3;
       int ans = missing(nums,k);
        System.out.println(ans);
    }

    static int missing(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;


    }

    static int missing2(int[] nums,int k){
        int low =0;
        int high = nums.length -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int missing = nums[mid]-(mid+1);
            if(missing<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high+k+1;


    }


}