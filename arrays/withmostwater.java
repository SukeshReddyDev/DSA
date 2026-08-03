

public class withmostwater{
    public static void main(String[] args){
        int[] nums={1,8,6,2,5,4,8,3,7};
        int ans = maxarea(nums);
        System.out.println(ans);

    }
    static int maxarea(int[] nums){
        int n = nums.length;
        int maxi=0;
        for(int i=0;i<n-1;i++){
            int area = 0;
            for(int j=i+1;j<n;j++){
                area = (j-1)*Math.min(nums[i],nums[j]);
                maxi = Math.max(area,maxi);
            }
        }
        return maxi;
    }

}