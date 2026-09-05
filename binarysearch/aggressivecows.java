import java.util.*;
public class aggressivecows{
    public static void main(String[] args){
       int[] nums = {0, 3, 4, 7, 10, 9};
       int k = 4;
       int ans = maxmin(nums,k);
        System.out.println(ans);
    }

    static int maxmin(int[] nums,int k){
        Arrays.sort(nums);
        int ans =0;
        for(int i=1;i<=(max(nums)-min(nums));i++){
            if(func(nums,k,i)==true){
                ans =i;
            }else{
                break;
            }
        }
        return ans;

    }

    static int maxmin2(int[] nums,int k){
        Arrays.sort(nums);
        int ans =-1;
        int low = 0;
        int high = max(nums)-min(nums);
        while(low<=high){
            int mid = low +(high-low)/2;
            if(func(nums,k,mid)==true){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;

    }

    static boolean func(int[] nums,int k,int dis){
        int cntcow = 1;
        int last = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last>=dis){
                cntcow++;
                last = nums[i];
            }
        }
        if(cntcow >= k){
            return true;
        }else{
            return false;
        }
    }

    static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;

    }

    static int min(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;

    }



}