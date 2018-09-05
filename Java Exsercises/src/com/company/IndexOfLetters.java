package com.company;

import java.util.Scanner;

public class IndexOfLetters {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[] input = in.nextLine().toCharArray();


        for (int i = 0; i < input.length; i++) {

            int value = input[i]- 97;

            System.out.println(input[i]+ " -> "+ value);
        }

    }
}
