

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



}