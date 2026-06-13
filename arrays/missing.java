// optimal Solution 


class Main {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5};
        int ans = missing(nums);
        System.out.println(ans);
    }
    
    static int missing(int[] nums){
        int n = nums.length;
        int sum =0;
        int exp_sum = (n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        
        int res = exp_sum-sum;
        return res;
    }
}

// brute force solution


class Main {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5};
        int ans = missing(nums);
        System.out.println(ans);
    }
    
    static int missing(int[] nums){
        int n = nums.length;
        for(int i=0;i<=n;i++){
            boolean found = false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    found = true;
                    break;
                }
            }
            if(found==false){
            return i;
            }
        }
        return -1;
    }
    
}

