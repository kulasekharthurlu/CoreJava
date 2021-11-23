package com.app.string;

public class CountOfOwels {

    public static void main(String[] args) {
        String str = "kulase khar";
        char[] ch = str.toCharArray();
        int count = 0;
        int ccount = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            } else if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                ccount++;
            } else {
                if (ch[i] == ' ') {
                    ccount--;
                }
                ccount++;
            }
        }
        System.out.println("Number of vowels in string is: " + count);
        System.out.println("Number of consonants in string is: " + ccount);
    }

}
