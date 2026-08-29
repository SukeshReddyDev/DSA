public class noofrotated{
    public static void main(String[] args){
        int[] nums = {3,4,5,1,2};
        int ans = findrotation(nums);
        System.out.println(ans);
    }

    static int findrotation(int[] nums){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mini=Integer.MAX_VALUE;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                if(nums[low]<mini){
                    mini = nums[low];
                    index=low;
                }
                low=mid+1;
            }
            else{
                if(nums[mid]<mini){
                    mini=nums[mid];
                    index=mid;
                }
                high=mid-1;


            }
        }
        return index;
    }


}