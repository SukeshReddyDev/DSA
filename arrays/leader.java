import java.util.*;
public class leader{
    public static void leader(String[] args) {
        int nums[] = {1,2,5,3,1,2};
        ArrayList<Integer> res = leaders(nums);
        System.out.println(res);



    }

    static ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            boolean leader = true;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]>=nums[i]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                ans.add(nums[i]);
            }
        }
        return ans;

    }


}