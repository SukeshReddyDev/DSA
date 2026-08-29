public class mininrotated{
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = min(nums);
        System.out.println(ans);
    }

    static int min(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;

    }

    static int min2(int[] nums){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                mini=Math.min(mini,nums[low]);
                low=mid+1;
            }
            else{
                mini=Math.min(mini,nums[mid]);
                high = mid-1;
            }
        }
        return mini;
    }


}