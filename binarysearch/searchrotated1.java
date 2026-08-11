

public class searchrotated1{
    public static void main(String[] args){
        int[] nums={4, 5, 6, 7, 0, 1, 2};
        int x = 0;
        int res = search(nums,x);
        System.out.println(res);

    }
    static int search(int[] nums , int target){
        int n = nums.length;
        int ans = -1;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                ans = i;
            }
        }
        return ans;
    }


}