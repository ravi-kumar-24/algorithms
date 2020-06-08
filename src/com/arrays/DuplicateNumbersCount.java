package com.arrays;

public class DuplicateNumbersCount {
    public static void main(String[] args) {
        int[] arr = {4,5,5,5,5,6,2,4,1,1,4,4,6,7,9,8,6,4,3,3,2,2,7,3,5,6,7,8,8,9,4,7,1,8};
        int[] temp = new int[10];
        for (int i = 0; i <arr.length; i++) {
            temp[arr[i]]++;
        }

        for (int i=0; i<temp.length;i++) {
            if(temp[i]>0) {
                System.out.println(i +" -> " +temp[i]);
            }
        }
    }
}
