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
        System.out.println(sb);
       // String rev = sb.toString();
       
     
        String st=new String(sb);
        if (str.equals(st)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

}
