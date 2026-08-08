import java.util.*;


public class floorceil{
    public static void main(String[] args){
        int[] nums={3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] res = res(nums,x);
        System.out.println(Arrays.toString(res));

    }
    static int[] res(int[] nums,int target){
        int n = nums.length;
        int low =0;
        int high = n-1;
        int floor = -1;
        int ceil = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                floor = nums[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }

        low =0;
        high = n-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                ceil = nums[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return new int[]{floor,ceil};
    }

}