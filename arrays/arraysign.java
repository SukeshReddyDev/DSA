import java.util.*;
public class arraysign {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};
        int[] res = maxsum(nums);
        System.out.println(Arrays.toString(res));


    }
    static int[] maxsum(int[] nums) {
       ArrayList<Integer> pos = new ArrayList<>();
       ArrayList<Integer> neg = new ArrayList<>();
       for(int i =0; i< nums.length;i++){
           if(nums[i]>0){
               pos.add(nums[i]);
           }
           else{
               neg.add(nums[i]);
           }
       }
       int[] ans = new int [nums.length];
       for(int i=0;i<(nums.length)/2;i++){
           ans[2*i] = pos.get(i);
           ans[(2*i)+1] = neg.get(i);
       }
       return ans;
    }
}