public class stock{
    public static void main(String[] args) {
        int[] nums = {10,7,5,8,11,9};
        maxsum(nums);



    }
    static void maxsum(int[] nums) {
        int maxprofit = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int profit = nums[j] - nums[i];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        System.out.println(maxprofit);
    }
}

