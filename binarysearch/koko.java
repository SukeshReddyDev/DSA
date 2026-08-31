public class koko{
    public static void main(String[] args){
       int[] nums = {3,6,7,11};
       int h = 8;
       int ans = min(nums,h);
        System.out.println(ans);
    }

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