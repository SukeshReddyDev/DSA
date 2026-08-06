public class upper{
    public static void main(String[] args){
        int[] nums={1,2,2,3};
        int x = 2;
        int sol = upper(nums,x);
        System.out.println(sol);

    }
    static int upper(int[] nums,int x){
        int ans = nums.length;
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] > x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }

}