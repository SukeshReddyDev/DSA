
class removedup{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int i =0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        int res = i+1;
        System.out.println(res);
       
    }


    
    
}