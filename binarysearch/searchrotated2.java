

public class searchrotated2{
    public static void main(String[] args){
        int[] nums={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int x = 10;
        boolean res = search(nums,x);
        System.out.println(res);

    }
    static boolean search(int[] nums , int target){
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }


}