package com.arrays;

public class DuplicateCharCounts {
    public static void main(String[] args) {
        String str = "&&&t\\??hisi||12sates{}}}}};;;;tst@...@ri///54,,,<<ngto{{te{{22$$$$stch43a)))))rc@@1ount^^^^s53((((((";
        char[] c = str.toCharArray();
         int NUMBER_OF_CHARS = 256;

         int[] temp = new int[NUMBER_OF_CHARS];

        for (int i = 0; i <c.length ; i++) {
            temp[c[i]]++; // here char will convert to ascii value and increase their value
                           //exam i is 4 and its char is t and it ascii value
                            //The ASCII value of t  =  116
                            // so it will increase value at 116
                            // while printing value again iterating its value by key
        }
        for (int i = 0; i <temp.length ; i++) {
            if(temp[i]>0) {
                System.out.println( (char) i+ " -> " + temp[i] + " " );
                //converting i int to char so we can get is character value
            }
        }



    }
}
