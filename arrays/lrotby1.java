
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,6};
        rotate(nums);


    }

    static void rotate(int[] nums){
        int l = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = l;
        System.out.print(Arrays.toString(nums));
    }

}