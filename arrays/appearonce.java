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
/*  
// optimal Solution

static int once1(int[] nums){
        int xor =0;
        for(int num :nums){
            xor = xor^num;
        }
        return xor;
    }



    // better Solution

    static int once2(int[] nums){
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int[] hash = new int[max+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]==1){
                return nums[i];
            }
        }
        return -1;
    }
}
