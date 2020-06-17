package com.general;

import java.util.stream.Stream;

public class DecimalToBinary {
    public static void main(String[] args) {
        int input = 15;
        String output = Integer.toString(input, 2);
        System.out.println(output);
        char[] chars = output.toCharArray();
       // Stream.of(chars).filter(c -> c =='1').filter()


        int count = 1;
        int max = 1;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '1' && chars[i] == chars[i + 1]) {
                count += 1;
                if (max < count) {
                    max = count;
                }

            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
