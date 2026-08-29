public class singleelement{
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans = single(nums);
        System.out.println(ans);
    }

    static int single(int[] nums){
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }
            else if(i==n-1){
                if(nums[i]!=nums[i-1]){
                    return nums[i];
                }
            }
            else{
                if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }
        }
        return -1;

    }


    // we can solve by using xor operation also mainly when the array is not sorted

    //Optimal approach

    static int single2(int[] nums){
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int low=1;
        int high = n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }

            if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;

    }


}