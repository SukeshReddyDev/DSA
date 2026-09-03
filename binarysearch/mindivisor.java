

public class mindivisor{
    public static void main(String[] args){
       int[] nums = {1,2,3,4,5};
       int limit = 7;
       int ans = mindiv(nums,limit);
        System.out.println(ans);
    }

    static int mindiv(int[] nums,int limit){
        for(int i=1;i<=max(nums);i++){
            if(func(nums,i)<=limit){
                return i;
            }
        }
        return -1;

    }

    //Optimal approach

    static int mindiv2(int[] nums,int limit){
        int low = 1;
        int high = max(nums);
        int ans = -1;
        while(low<=high){
            int mid =(low+high)/2;
            if(func(nums,mid)<=limit){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }


    static double func(int[] nums,int div){
        double sum =0;
        for(int i=0;i<nums.length;i++){
            sum = sum+Math.ceil((double)(nums[i])/(double) (div));
        }
        return sum;
    }

    static int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}