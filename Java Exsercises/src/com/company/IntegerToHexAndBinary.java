package com.company;

import java.util.Scanner;

public class IntegerToHexAndBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        System.out.println(Integer.toHexString(num).toUpperCase());

        System.out.println(Integer.toBinaryString(num));


    }


}

