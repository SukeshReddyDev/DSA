public class consecsequence{
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 3, 1, 2};
        int res = consec(nums);
        System.out.println(res);


    }
    static int consec(int[] nums){
        int largest = 1;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int ctr = 1;
            while(ls(nums,x+1)==true){
                x=x+1;
                ctr = ctr+1;
            }
            largest = Math.max(largest,ctr);
        }
        return largest;

    }
    static boolean ls(int[] nums,int tar){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==tar){
                return true;
            }

        }
        return false;
    }


}