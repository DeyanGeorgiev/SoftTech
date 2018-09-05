package com.company;

import java.util.Scanner;

public class FitStringIn20Chars {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        if (word.length() < 20) {
            //padRight(20-word.length());

            System.out.println(word + padRight(20 - word.length()));
        }

        if (word.length()>20){

           String toPrint = word.substring(0, 20);

            System.out.println(toPrint);
        }


    }

    private static String padRight(int i) {
        String padding = "";
        for (int j = 0; j < i; j++) {
            padding = padding + "*";
        }

        return padding;

    }




}
