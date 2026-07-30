

public class maxproduct{
    public static void main(String[] args){
        int[] nums={-5,0,-2};
        int ans = max(nums);
        System.out.println(ans);

    }

    static int max(int[] nums){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=i;j<nums.length;j++){
                prod = prod*nums[j];
                maxi = Math.max(prod,maxi);
            }
        }
        return maxi;
    }

    static int max1(int[] nums){
        int maxi=Integer.MIN_VALUE;
        int prefix =1;
        int n = nums.length;
        int suffix =1;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix =1;
            }
            if(suffix ==0){
                suffix=1;
            }
            prefix = prefix*nums[i];
            suffix = suffix*nums[n-i-1];
            maxi=Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;
    }

}