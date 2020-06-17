package com.matrix;

public class ColumnRowPrint {

    public static void main(String[] args) {
        printArrays1(5);
    }

    public static void printArrays(int numberOfElements){
        int[] numbers = {3, 6, 8, 7, 9};
        int[][] arr = new int[numberOfElements][numberOfElements];
        for(int i=0; i<numberOfElements; i++){
            int j;
            for( j=i; j<numberOfElements; j++){
                System.out.print(numbers[j]+" ");

            }
            for(int k=0; k<numberOfElements-j+i; k++){
                System.out.print(numbers[k]+" ");
            }
            System.out.println();
        }
    }

    public static void printArrays1(int numberOfElements){
        int[] numbers = {3, 6, 8, 7, 9};
        int[][] arr = new int[numberOfElements][numberOfElements];
        int j =0;
        int k =0;
        for(int i=0; i<numberOfElements; i++){
            for(int h=i+1; h<numberOfElements-i; h++) {
                arr[i][h] = numbers[i];
                arr[h][k++] = numbers[i];
            }

        }
        for (int i = 0; i < numberOfElements; i++) {
            for (int x = 0; x < numberOfElements; x++) {
                System.out.print(arr[i][x]+" ");
            }
            System.out.println();
        }

    }

}
