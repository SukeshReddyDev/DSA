

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


    static boolean search2(int[] nums , int target){
        int n = nums.length;
        int low =0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return true;
            }

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }


}