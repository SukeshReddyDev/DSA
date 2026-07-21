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
}