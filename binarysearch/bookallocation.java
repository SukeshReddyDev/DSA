
public class bookallocation{
    public static void main(String[] args){
       int[] nums = {25, 46, 28, 49, 24};
       int k = 4;
       int ans = maxmin(nums,k);
        System.out.println(ans);
    }


    static int maxmin(int[] nums,int stu){
        if(stu > nums.length){
            return -1;
        }
        for(int i=max(nums);i<= sum(nums);i++){
            int stud = fun(nums,i);
            if(stud <= stu){
                return i;
            }
        }
        return -1;

    }

    static int fun(int[] nums,int maxpages){
        int student = 1;
        int pages = 0;
        for(int i=0;i<nums.length;i++){
            if(pages+nums[i]<=maxpages){
                pages += nums[i];
            }else{
                student++;
                pages = nums[i];
            }
        }
        return student;
    }


    static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;

    }

    static int sum(int[] nums){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }





}