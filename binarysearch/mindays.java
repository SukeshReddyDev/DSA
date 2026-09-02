


public class mindays{
    public static void main(String[] args){
       int[] nums = {1,10,3,10,2};
       int m = 3;
       int k = 2;
       int ans = minday(nums,m,k);
        System.out.println(ans);
    }

    static int minday(int[] nums,int m,int k){

        long flower = m*k;
        if(flower>nums.length){
            return -1;
        }
        for(int i=min(nums);i<=max(nums);i++){
            if(func(nums,i,m,k)==true){
                return i;
            }
        }
        return -1;

    }

    static boolean func(int[] nums,int days,int m,int k){

        int ctr=0;
        int noof = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=days){
                ctr++;
            }else{
                noof += ctr/k;
                ctr = 0;
            }
        }
        noof += ctr/k;

        if(noof >= m){
            return true;
        }else{
            return false;
        }

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

    static int min(int[] nums){
        int min= Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }



}