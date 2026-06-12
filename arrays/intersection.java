// Optimal Solution


/*import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,3,4,5,6};
        int[] arr2 = {3,3,4,5,8,9};
        System.out.println(intersection(arr1,arr2));

    }
    static ArrayList<Integer> intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }
            else if (arr1[i]==arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}*/

// Brute force 
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4,5,6};
        int[] arr2 = {3,3,4,5,8,9};

        System.out.println(intersection(arr1, arr2));
    }

    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] v =new boolean[arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j] && v[j] != true) {
                        ans.add(arr1[i]);
                        v[j] = true;
                    break;
                }
                if(arr2[j] > arr1[i]){
                    break;
                }
            }
        }
        return ans;
    }
}