
import java.util.*;
public class dutchsort{
    public static void main(String[] args) {

        int[] nums = {1, 0, 2, 1, 0};

        int[] res = sorting(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] sorting(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            boolean swap = false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swap = true;
                }
            }
            if(swap==false){
                break;
            }
        }
        return nums;


    }

    // count digit better approach
     static int[] sorting1(int[] nums){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            nums[i] = 0;
        }
        for(int i=count0;i<count0+count1;i++){
            nums[i] = 1;
        }
        for(int i=count0+count1;i<nums.length;i++){
            nums[i]=2;
        }
        return nums;

    }


    //dutch flag algorithm
     static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {

                mid++;
            }

            else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}