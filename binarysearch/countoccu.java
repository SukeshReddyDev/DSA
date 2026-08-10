

public class countoccu{
    public static void main(String[] args){
        int[] nums={5,7,8,8,8,10};
        int x = 8;
        int res = count(nums,x);
        System.out.println(res);

    }
    static int count(int[] nums,int target){
        int n = nums.length;
        int cou = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                cou +=1;
            }
        }
        return cou;



    }

}