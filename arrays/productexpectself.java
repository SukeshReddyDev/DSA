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
                
            }
            ans[i] = pro;


        }
        return ans;
    }


    static int[] product1(int[] nums){
        int n = nums.length;
       int[] ans = new int[n];
       int[] left = new int[n];
       int[] right = new int[n];
       left[0]=1;
       for(int i=1;i<n;i++){
           left[i] = left[i-1]*nums[i-1];
       }
       right[n-1] = 1;
       for(int i=n-2;i>=0;i--){
           right[i] = right[i+1]*nums[i+1];
       }
       for(int i=0;i<n;i++){
           ans[i]=left[i]*right[i];
       }
       return ans;
    }

    static int[] product2(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] = ans[i]*right;
            right = right*nums[i];

        }
        return ans;

    }



}