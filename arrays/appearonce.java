// brute force solution 



class Main {
    public static void main(String[] args) {
        int[] nums = {5};
        int res = once(nums);
        System.out.println(res);
        
    }
    
    static int once(int[] nums){
        int num =  0;
        for(int i=0;i<nums.length;i++){
            int count =0;
            num = nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num){
                    count++;
                }
            }
            if(count==1){
                return num;
            }
            
        }
        return -1;
    }
}