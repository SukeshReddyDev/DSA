
import java.util.*;
class bubble{
    public static void main(String[] args) {
        int[] nums = {7,4,1,5,2};
        int[] result = bubbleSort(nums);
        System.out.println(Arrays.toString(result));


    }

    static int[] bubbleSort(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        return nums;



    }

}