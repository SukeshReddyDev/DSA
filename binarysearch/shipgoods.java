

public class shipgoods{
    public static void main(String[] args){
       int[] nums = {1,2,3,4,5,6,7,8,9,10};
       int days = 5;
       int ans = mindays(nums,days);
        System.out.println(ans);
    }

    static int mindays(int[] nums,int days){
        for(int i=max(nums);i<=sum(nums);i++){
            int reqdays = func(nums,i);
            if(reqdays<=days){
                return i;
            }

        }
        return -1;


    }

    static int mindays2(int[] nums,int days){
        int low = max(nums);
        int high = sum(nums);
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int reqdays = func(nums,mid);
            if(reqdays<=days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;


    }

    static int func(int[] nums,int capacity){
        int days = 1;
        int load = 0;
        for(int i=0;i<nums.length;i++){
            if(load+nums[i]>capacity){
                days = days+1;
                load = nums[i];
            }else{
                load = load+nums[i];
            }
        }
        return days;
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

    static int sum(int[] nums){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}