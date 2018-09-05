package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BombNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] input = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int bomb = in.nextInt();
        int range = in.nextInt();
        in.nextLine();

        for (int i = 0; i < input.length; i++) {
            if (input[i] == bomb) {
                for (int j = i; j <= i + range; j++) {
                    if (input.length > j) {
                        input[j] = 0;
                    }
                }
                for (int j = i; j >= i - range; j--) {
                    if (j >= 0) {
                        input[j] = 0;
                    }
                }
            }
        }

        int sum = 0;
        for (int i : input) {
            sum += i;
        }


        System.out.print(sum);
    }
}

