import java.util.*;
public class countsub{
    public static void main(String[] args) {
       int[] nums = {3,1,2,4};
       int k = 6;
       int res = count(nums,k);
       System.out.println(res);



    }
    static int count(int[] nums, int k){
        int cou = 0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum = sum+nums[j];
                if(sum == k){
                    cou = cou +1;
                }
            }

        }
        return cou;

    }
}