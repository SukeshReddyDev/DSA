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