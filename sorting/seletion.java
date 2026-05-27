
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4,5};
        int[] result = selectionSort(nums);
        System.out.println(Arrays.toString(result));


    }

    static int[] selectionSort(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            int max = 0;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]>nums[max]){
                    max = j;
                }
            }
            int temp = nums[max];
            nums[max]=nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
        return nums;



    }

}