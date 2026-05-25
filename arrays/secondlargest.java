

class secondlargest{
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,4};
        int a = large(nums);
        System.out.println(a);
    
    }
    static int large(int[] nums){
        if(nums.length < 2){
            return -1;
        }
        int l =nums[0];
        int s = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>l){
                s=l;
                l=nums[i];
            }
            else if(nums[i]>s && nums[i] != l){
                s=nums[i];
            }
        }
        if(s==Integer.MIN_VALUE){
            return -1;
        }
        return s;
        
        
    }
}