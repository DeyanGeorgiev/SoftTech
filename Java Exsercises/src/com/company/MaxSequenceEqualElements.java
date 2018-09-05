package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceEqualElements {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int index = 0;
        int len = 1;

        int bestIndex = 0;
        int bestLen = 0;


        for (int i = 0; i < input.length - 1; i++) {

            if (input[i] == input[i + 1]) {
                index = input[i];
                len++;


                if (bestLen < len) {
                    bestIndex = index;
                    bestLen = len;
                }


            } else {

                len = 1;
                index = 0;


            }
        }

        for (int i = 0; i < bestLen; i++) {

            System.out.print(bestIndex + " ");

        }
    }
}
