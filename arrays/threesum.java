import java.util.*;

public class threesum{
    public static void main(String[] args){
        int[] nums = {2, -2, 0, 3, -3, 5};
        Set<List<Integer>> ans = threesum(nums);
        System.out.println(ans);

    }


    static Set<List<Integer>> threesum(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        Collections.sort(temp);
                        set.add(temp);

                    }


                }

            }
        }
        return set;

    }


    // Better approach
    static List<List<Integer>> threesum1(int[] nums){
       Set<List<Integer>> hashset = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k = -(nums[i]+nums[j]);
                if(set.contains(k)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(k);
                    Collections.sort(temp);
                    hashset.add(temp);
                }
                set.add(nums[j]);

            }
        }
        return new ArrayList<>(hashset);

    }

    // Optimal approach

    static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate left elements
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right elements
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return ans;
    }
}