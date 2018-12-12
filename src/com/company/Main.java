package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to count: ");
        String string = in.nextLine();
        System.out.println("Numbers of letters are:" + getAll(string, 0));
        System.out.println("Numbers of digits are:" + getAll(string, 1));
        System.out.println("Numbers of space are:" + getAll(string, 2));
        System.out.println("Numbers of others are:" + getAll(string, 3));
        System.out.println();
        getAlls(string);


    }

    public static int getAll(String st, int n) {
        int letter = 0;
        int digit = 0;
        int space = 0;
        int other = 0;
        char[] ch = st.toCharArray();
        for (int i = 0; i <= st.length() - 1; i++) {
            if (Character.isLetter(st.charAt(i))) {
                letter++;
            } else if (Character.isDigit(st.charAt(i))) {
                digit++;
            } else if (Character.isSpaceChar(st.charAt(i))) {
                space++;

            } else {
                other++;
            }

        }
        if (n == 0)
            return letter;
        else if (n == 1)
            return digit;
        else if (n == 2)
            return space;
        else
            return other;
    }
// second method
    public static void getAlls(String st) {
        int letter = 0;
        int digit = 0;
        int space = 0;
        int other = 0;
        char[] ch = st.toCharArray();
        for (int i = 0; i <= st.length() - 1; i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                digit++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;

            } else {
                other++;
            }

        }
        System.out.println("The number of letters are: " + letter);
        System.out.println("The  number of digits are: " + digit);
        System.out.println("The number of whitespaces  are: " + space);
        System.out.println("the  number of others are: " + other);
    }
}


