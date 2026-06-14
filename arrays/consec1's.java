// Optimal Solution



class Main {
    public static void main(String[] args) {
        int[] nums={1,1,0,0,1,1,1,0,0};
        int res = consec(nums);
        System.out.println(res);
        
    }
    
    static int consec(int[] nums){
        int count = 0;
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}

// Brute force 
/* class Main {
    public static void main(String[] args) {
        int[] nums={1,1,0,0,1,1,1,0,0};
        int res = consec(nums);
        System.out.println(res);
        
    }
    
    static int consec(int[] nums){
        int maxcount = 0;
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                count++;
                }
                else{
                    break;
                }
                
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}
*/