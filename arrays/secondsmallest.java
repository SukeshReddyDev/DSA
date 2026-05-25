

class secondsmallest{
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,4};
        int a = small(nums);
        System.out.println(a);
    
    }
    static int small(int[] nums){
        if(nums.length < 2){
            return -1;
        }
        int l =Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<l){
                s=l;
                l=nums[i];
            }
            else if(nums[i]<s && nums[i] != l){
                s=nums[i];
            }
        }
        if(s==Integer.MAX_VALUE){
            return -1;
        }
        return s;
        
        
    }
}