import java.util.*;
public class nextpermu{
    public static void nextpermu(String[] args) {
        int nums[] = {1,2,7,4,3,1};
        int[] res = permutation(nums);
        System.out.println(Arrays.toString(res));



    }

    static int[] permutation(int[] nums){
        int ind = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(nums,0,n-1);
            return nums;
        }
        for(int i =n-1;i>ind ;i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }

        }
        reverse(nums,ind+1,n-1);
        return nums;
    }

    static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }

}