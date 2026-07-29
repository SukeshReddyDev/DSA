import java.util.*;


public class mergearray{
    public static void main(String[] args){
        int[] nums1 = {-5, -2, 4, 5};
        int[] nums2 = {-3,1,8};
        merge(nums1,nums2);


    }

    static void merge(int[] nums1,int[] nums2){
        int m = nums1.length;
        int n  = nums2.length;
        int[] nums3 = new int[m+n];
        int left =0;
        int right =0;
        int index =0;
        while(left<m && right<n){
            if(nums1[left] <= nums2[right]){
                nums3[index++] = nums1[left++];
            }
            else{
                nums3[index++] = nums2[right++];
            }
        }
        while(left<m){
            nums3[index++] = nums1[left++];
        }
        while(right<n){
            nums3[index++] = nums2[right++];
        }
        for(int i=0;i<m+n;i++){
            if(i<m){
                nums1[i] = nums3[i];
            }else{
                nums2[i-n]=nums3[i];
            }
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));


    }

}