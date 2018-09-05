package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] input = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        boolean isFound = false;

        for (int currentElement = 0; currentElement < input.length; currentElement++)
        {
            int sumLeft = 0;
            int sumRight = 0;

            for (int i = currentElement + 1; i < input.length; i++)
            {
                sumRight += input[i];
            }
            for (int i = 0; i < currentElement; i++)
            {
                sumLeft += input[i];
            }

            if (sumRight == sumLeft)
            {
                System.out.print(currentElement);
                isFound = true;
                break;
            }
        }
        if (!isFound)
        {
            System.out.print("no");
        }
    }
}
