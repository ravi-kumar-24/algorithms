package com.patterns;

public class SnakeCase {

    public static void main(String[] args) {
        String str ="dsadasd_asdsa";
        String s =convertToSnakeCase(str);
        System.out.println(s);

    }
    private static String convertToSnakeCase(final String identifier) {
		final String regex = "([a-z])([A-Z])";
		final String replacement = "$1_$2";
		final String newName = identifier
                .replaceAll(regex, replacement)
        .toLowerCase();
		return newName;
		}
}
