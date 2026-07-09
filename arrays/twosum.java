import java.util.*;
public class twosum{
    public static void main(String[] args) {

        int[] nums = {1,6,2,10,3};
        int k = 7;

        int[] res = twosum(nums, k);
        int[] res1 = twosum1(nums, k);
        System.out.println(Arrays.toString(res));
    }

    // brute force
    static int[] twosum(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i] + nums[j];
                if(sum == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // HAshing technique better solution
    static int[] twosum1(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int rem = k-a;
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            else{
                map.put(a,i);
            }
        }
        return new int[]{-1,-1};
    }
}