import java.util.*;
public class subarraywithsum0 {
    public static void main(String[] args) {
       int[] nums = {2,10,4};
       int res = len(nums);
        System.out.println(res);


    }
    static int len(int[] nums){
        int maxlen =0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum = sum +nums[j];
                if(sum ==0){
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }


    static int longest1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            if(sum == 0){
                maxlen = i+1;
            }
            int rem = sum ;
            if(map.containsKey(rem)){
                int len = i-map.get(rem);
                maxlen = Math.max(maxlen,len);
            }
            if(map.containsKey(sum)==false){
                map.put(sum,i);
            }

        }
        return maxlen;

    }
}