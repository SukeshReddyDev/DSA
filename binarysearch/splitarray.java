public class splitarray{
    public static void main(String[] args){
       int[] nums = {1,2,3,4,5};
       int k = 3;
       int ans = maxmin(nums,k);
        System.out.println(ans);
    }


    static int maxmin(int[] nums,int m){
        for(int i=max(nums);i<=sum(nums);i++){
            int subarrreq = fun(nums,i);
            if(subarrreq <= m){
                return i;

            }
        }
        return -1;

    }

    static int maxmin2(int[] nums,int m){
        int low = max(nums);
        int high = sum(nums);
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int subreq = fun(nums,mid);
            if(subreq <= m){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;

    }

    static int fun(int[] nums,int limit){
        int subarr = 1;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=limit){
                sum += nums[i];
            }else{
                subarr++;
                sum=nums[i];
            }
        }
        return subarr;
    }


    static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;

    }

    static int sum(int[] nums){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }





}