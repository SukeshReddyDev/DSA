
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
}