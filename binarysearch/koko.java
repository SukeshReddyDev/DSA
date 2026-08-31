public class koko{
    public static void main(String[] args){
       int[] nums = {3,6,7,11};
       int h = 8;
       int ans = min(nums,h);
        System.out.println(ans);
    }

    //we have to find the min banans that the koko can eat 
    // so that it complete all the bananas in pile with given time

    static int min(int[] nums,int h){
        int n = max(nums);
        for(int i=1;i<n;i++){
            int reqtime = fun(nums,i);
            if(reqtime<=h){
                return i;
            }
        }
        return -1;

    }

    //Optimal Solution 
    static int min2(int[] nums,int h){
        int low = 1;
        int high = max(nums);
        int ans = Integer.MIN_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int reqtime = fun(nums,mid);
            if(reqtime<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }


    static int fun(int[] nums,int mid){
        int tothours = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            tothours += Math.ceil((double)nums[i]/(double)mid);
        }
        return tothours;
    }
    static int max(int[] nums){
        int max= Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

}