import java.util.*;
public class hello {
    public static void main(String[] args) {

        int[] nums = {1,6,2,10,3};
        int k = 7;

        int[] res = twosum(nums, k);
        System.out.println(Arrays.toString(res));
    }
    static int[] twosum(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i] + nums[j];
                if(sum == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}