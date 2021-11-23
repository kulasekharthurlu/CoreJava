package com.app.string;

public class PalinromeString {
    // palindromeString
    public static void main(String[] args) {
        String str = "kak";
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        String rev = sb.toString();
        if (str.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

}
