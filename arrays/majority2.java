import java.util.*;
public class majority2{
    public static void main(String[] args) {
        int[] nums = {1,2,1,1,3,2,2};
        ArrayList<Integer> res = majority(nums);
        System.out.println(res);


    }

    static ArrayList<Integer> majority(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int cou =0;

            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    cou++;
                }
            }
            if(cou>(nums.length)/3 && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
        return ans;
    }


    static ArrayList<Integer> majority2(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        for(int num : map.keySet()){
            if(map.get(num) > (int) nums.length/3){
                ans.add(num);
            }
        }
        return ans;
    }


    static ArrayList<Integer> majority3(int[] nums){

    ArrayList<Integer> ans = new ArrayList<>();

    int cou1 = 0, cou2 = 0;
    int ele1 = 0, ele2 = 0;

    // Step 1: Find candidates
    for(int i = 0; i < nums.length; i++){

        if(nums[i] == ele1){
            cou1++;
        }
        else if(nums[i] == ele2){
            cou2++;
        }
        else if(cou1 == 0){
            ele1 = nums[i];
            cou1 = 1;
        }
        else if(cou2 == 0){
            ele2 = nums[i];
            cou2 = 1;
        }
        else{
            cou1--;
            cou2--;
        }
    }

    // Step 2: Verify candidates
    cou1 = 0;
    cou2 = 0;

    for(int i = 0; i < nums.length; i++){

        if(nums[i] == ele1){
            cou1++;
        }
        else if(nums[i] == ele2){
            cou2++;
        }
    }

    if(cou1 > nums.length / 3){
        ans.add(ele1);
    }

    if(cou2 > nums.length / 3){
        ans.add(ele2);
    }

    return ans;
}
}
