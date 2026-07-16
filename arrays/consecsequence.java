import java.util.*;
public class consecsequence{
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 3, 1, 2};
        int res = consec(nums);
        System.out.println(res);
        int res1 = consec1(nums);
        System.out.println(res1);


    }
    static int consec(int[] nums){
        int largest = 1;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int ctr = 1;
            while(ls(nums,x+1)==true){
                x=x+1;
                ctr = ctr+1;
            }
            largest = Math.max(largest,ctr);
        }
        return largest;

    }
    static boolean ls(int[] nums,int tar){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==tar){
                return true;
            }

        }
        return false;
    }


    // Better approach 
    static int consec1(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int cou =0;
        int ls = Integer.MIN_VALUE;
        int longest = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == ls){
                cou += 1;
                ls = nums[i];
            }
            else if (ls != nums[i]){
                cou = 1;
                ls=nums[i];
            }
            longest = Math.max(longest,cou);
        }
        return longest;
    }


}