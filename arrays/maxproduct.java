import java.util.*;


public class hello{
    public static void main(String[] args){
        int[] nums={-5,0,-2};
        int ans = max(nums);
        System.out.println(ans);

    }

    static int max(int[] nums){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=i;j<nums.length;j++){
                prod = prod*nums[j];
                maxi = Math.max(prod,maxi);
            }
        }
        return maxi;
    }

}