import java.util.*;

public class foursum{

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        Set<List<Integer>> ans = fourSum(nums, target);

        System.out.println(ans);
    }

    static Set<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }

        return set;
    }



    //Better approach 

    static List<List<Integer>> foursum1(int[] nums,int target){
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                HashSet<Integer> hashset = new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                    int l = target-(nums[i]+nums[j]+nums[k]);
                    if(hashset.contains(l)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(l);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    hashset.add(nums[k]);

                }
            }
        }
        return new ArrayList<>(set);
    }


    //Better approach

    static List<List<Integer>> foursum2(int[] nums,int target){
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1&& nums[j] == nums[j-1]){
                    continue;
                }
                int left =j+1;
                int right = n-1;
                while(left<right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left] == nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right] == nums[right+1]){
                            right--;
                        }
                    } else if (sum<target) {
                        left++;

                    }
                    else{
                        right--;
                    }


                }
            }
        }
        return new ArrayList<>(ans);
    }


}