import java.util.*;


public class firstlast{
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int x = 6;
        int[] res = res(nums,x);
        System.out.println(Arrays.toString(res));

    }
    static int[] res(int[] nums,int target){
        int first = -1;
        int last = -1;

        // Find first occurrence
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;       // search left
            }
            else if (nums[mid] < target) {
                low = mid + 1;        // search right
            }
            else {
                high = mid - 1;       // search left
            }
        }

        // Find last occurrence
        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;        // search right
            }
            else if (nums[mid] < target) {
                low = mid + 1;        // search right
            }
            else {
                high = mid - 1;       // search left
            }
        }

        return new int[]{first, last};

    }

}