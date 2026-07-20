import java.util.*;
public class countsub{
    public static void main(String[] args) {
       int[] nums = {3,1,2,4};
       int k = 6;
       int res = count(nums,k);
       System.out.println(res);



    }
    static int count(int[] nums, int k){
        int cou = 0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum = sum+nums[j];
                if(sum == k){
                    cou = cou +1;
                }
            }

        }
        return cou;

    }

    static int count1(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int cou =0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            int rem = sum -k;
            if(map.containsKey(rem)){
                cou = cou + map.get(rem);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }

        }
        return cou;

    }
}