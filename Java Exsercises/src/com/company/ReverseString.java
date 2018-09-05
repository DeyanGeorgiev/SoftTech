package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        List<String> input = Arrays.stream(in.nextLine().split("")).collect(Collectors.toList());

        Collections.reverse(input);

        System.out.println(String.join("", input));

    }
}
