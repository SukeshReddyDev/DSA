public class subarraykad{
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        maxsum(nums);
        


    }
    static void maxsum(int[] nums) {
        int sum=0;
        int maxsum =0;
        int temp =0;
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];

            if(sum>maxsum){
                maxsum=sum;
                start =temp;
                end=i;

            }
            if(sum<0){
                sum=0;
                temp=i+1;
            }
        }
        System.out.println(maxsum);
        for(int i=start;i<=end;i++){
            System.out.print(nums[i]+" ");
        }

    }
}