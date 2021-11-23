package com.app.string;

public class CountOfSpacesInString {

    public static void main(String[] args) {
        String str = "kulasekhar ali";
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                count++;
            }
        }
        System.out.println("Number of spaces in string is: " + count);
    }
}
