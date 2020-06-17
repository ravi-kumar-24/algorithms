package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestMissingNumberInArrays {
    public static void main(String[] args) {
        SmallestMissingNumberInArrays missingNumberInArrays = new
                SmallestMissingNumberInArrays();
        int[] arr = {10, 30, 60, 40, 10, 20};
        int x = missingNumberInArrays.solution(arr);
        System.out.println(x);
    }

    public int solution1(int[] A) {
        // write your code in Java SE 8
        int smallestMissingNumber =1;
         Arrays.sort(A);

        for (int i = 0; i <A.length -1 ; i++) {
             if(A[i] >0 && A[i+1]>0 && (A[i+1]- A[i])>1){
                 return A[i]+1;
             }
        }
        if(A[A.length-1]>0){
            return A[A.length-1] +1;
        }else {
            return smallestMissingNumber;
        }
    }

    public int solution(int[] A) {
        // write your code in Java SE 8

        //special case
        if(A.length ==0){
            return 1;
        }

        // Using "set" to check if an element has appeared
        // note: need to "import java.util.*" (important)
        Set<Integer> set = new HashSet<>();

        // add elements into the set
        for(int i=0; i< A.length; i++){
            set.add(A[i]);
        }

        // note: the missing number is not possible bigger than (A.length)
        //       because there are only (A.length) numbers
        for(int i=1; i<= A.length; i++){
            if(set.contains(i) != true) // the 1st missing element
                return i;
        }

        // means: there are no missing numbers from 1 to A.length
        // Therefore, the missing number is "A.length+1" (important)
        return A.length+1;
    }
}
