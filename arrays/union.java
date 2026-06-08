// Brute force Solution


import java.util.*;
class Main {
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

