// BRUTE FORCE APPROACH

import java.util.*;
class Main {
    public static void main(String[] args){
        int[] arr = {0, 0, 0, 1, 3, -2};
        move(arr);
    }
    static void move(int[] arr){
        int i = 0;
        int[] temp = new int[arr.length];
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != 0){
                temp[i] = arr[j];
                i++;
            }
        }
        for(int j = 0; j < temp.length; j++){
            arr[j] = temp[j];
        }
        int nonzero = i;
        for(int j = nonzero; j < arr.length; j++){
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}


// optimized approach


/*class Main {
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,5,6,7};
        swap(nums);

    }
    static void swap(int[] nums){
        int j = -1;
        for(int i=0;i < nums.length;i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
        }
        if(j==-1){
            System.out.println("No zeros present");
            System.out.println(Arrays.toString(nums));
            return;
        }
        for(int i =j+1;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
