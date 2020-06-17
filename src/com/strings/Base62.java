package com.strings;

public class Base62 {

    public static void main(String[] args) {
        String output =generateBase62String(999112113);
        System.out.println(output);
    }

    public static String generateBase62String(int deci){
        String str ="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = str.toCharArray();

        String hashStr ="";

        while (deci>0){
            hashStr = chars[deci%62] + hashStr;
            deci/=62;
        }

        return hashStr;
    }
}
