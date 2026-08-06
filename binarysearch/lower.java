import java.util.*;


public class lower{
    public static void main(String[] args){
        int[] nums={3,5,8,15,19};
        int x = 9;
        int sol = lower(nums,x);
        System.out.println(sol);

    }
    static int lower(int[] nums,int x){
        int ans = nums.length;
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= x){
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