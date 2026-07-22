import java.util.*;
public class majority2{
    public static void main(String[] args) {
        int[] nums = {1,2,1,1,3,2,2};
        ArrayList<Integer> res = majority(nums);
        System.out.println(res);


    }

    static ArrayList<Integer> majority(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int cou =0;

            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    cou++;
                }
            }
            if(cou>(nums.length)/3 && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
