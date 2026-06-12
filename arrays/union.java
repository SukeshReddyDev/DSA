// Brute force Solution


/* import java.util.*;
class union {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,4};
        int[] n2  = {1,2,3,6,7,8};
        union(n1,n2);
    }
    
    static void union(int[] n1,int[] n2){
        Set<Integer> s = new TreeSet<>();
        
        for(int i : n1){
            s.add(i);
        }
        for(int i : n2){
            s.add(i);
        }
        System.out.print(s);
    }
}
*/
// Optimal Solution


import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7,8};
        System.out.println(union(arr1,arr2));

    }
    
    static ArrayList<Integer> union(int[] arr1,int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1) != arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1) != arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
            else{
                if(ans.size()==0 || ans.get(ans.size()-1) != arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            if(ans.size()==0 || ans.get(ans.size()-1) != arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(ans.size()==0 || ans.get(ans.size()-1) != arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }
        return ans;
        
        
        
    }
    
}
        