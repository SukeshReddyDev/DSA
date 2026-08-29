

public class countoccu{
    public static void main(String[] args){
        int[] nums={5,7,8,8,8,10};
        int x = 8;
        int res = count(nums,x);
        System.out.println(res);

    }
    //Brute force using Linear search
    static int count(int[] nums,int target){
        int n = nums.length;
        int cou = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                cou +=1;
            }
        }
        return cou;
    }


    // Optimal approach
    
    static int count2(int[] nums,int target){
        int first = -1;
        int last = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;       // search left
            }
            else if (nums[mid] < target) {
                low = mid + 1;        // search right
            }
            else {
                high = mid - 1;       // search left
            }
        }

        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;        // search right
            }
            else if (nums[mid] < target) {
                low = mid + 1;        // search right
            }
            else {
                high = mid - 1;       // search left
            }
        }
        if(first == -1){
            return 0;
        }
        return last-first+1;

    }

    

}