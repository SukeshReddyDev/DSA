public class kthmissing{
    public static void main(String[] args){
       int[] nums = {1,4,6,8,9};
       int k = 3;
       int ans = missing(nums,k);
        System.out.println(ans);
    }

    static int missing(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;


    }


}