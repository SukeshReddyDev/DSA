import java.util.*;


public class productexpectself{
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        int[] sol = product(nums);
        System.out.println(Arrays.toString(sol));

    }
    static int[] product(int[] nums){
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int pro =1;
            for(int j=0;j<nums.length;j++){
                if(i != j){
                    pro = pro*nums[j];
                }
                ans[i] = pro;
            }


        }
        return ans;
    }

}