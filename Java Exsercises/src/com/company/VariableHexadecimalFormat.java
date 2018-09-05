package com.company;

import java.util.Scanner;

public class VariableHexadecimalFormat {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String string= in.nextLine();

        int num = Integer.parseInt(string, 16);


        System.out.println(num);


    }
}
