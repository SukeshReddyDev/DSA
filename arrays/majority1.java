import java.util.*;
public class majority1 {
    public static void main(String[] args) {

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int res = sorting(nums);
        System.out.println(res);
    }
    static int sorting(int[] nums){
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;

    }
}