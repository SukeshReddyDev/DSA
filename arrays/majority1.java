import java.util.*;
public class majority1 {
    public static void main(String[] args) {

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int res = sorting(nums);
        int res1 = sorting1(nums);
        System.out.println(res);
    }
    static int sorting(int[] nums){
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;

    }

    static int sorting1(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }
        return -1;

    }
} 