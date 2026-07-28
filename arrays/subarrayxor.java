import java.util.*;

public class subarrayxor{
    public static void main(String[] args){
        int[] nums = {5,6,7,8,9};
        int target = 5;
        int ans = count(nums,target);
        System.out.println(ans);


    }

    static int count(int[] nums,int target){
        int cou =0;
        for(int i=0;i<nums.length;i++){
            int xor = 0;
            for(int j=i;j<nums.length;j++){
                xor = xor^nums[j];
                if(xor == target){
                    cou++;
                }
            }
        }
        return cou;
    }


    //Optimal approach
    static int count1(int[] nums,int target){
       int cou =0;
       HashMap<Integer,Integer> map = new HashMap<>();
       int xor =0;
       map.put(0,1);
       for(int i=0;i<nums.length;i++){
           xor = xor^nums[i];
           int x = xor^target;
           if(map.containsKey(x)){
               cou = cou+map.get(x);
           }
           if(map.containsKey(xor)){
               map.put(xor,map.get(xor)+1);
           }
           else{
               map.put(xor,1);
               
           }
           
       }
       return cou;
    }



}