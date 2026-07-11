public class kadans{
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        int res =  maxsum(nums);
        System.out.println(res);
        maxSubArray(nums);


    }
    static int maxsum(int[] nums) {
        int maxsum = 0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                maxsum = Math.max(maxsum,sum);
            }
        }
        return maxsum;


    }

    static void maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);

        System.out.print("Subarray = ");

        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}