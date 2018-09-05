package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareCharArrays {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] firstArr = bf.readLine().split(" ");
        String[] secArr = bf.readLine().split(" ");

        int lenght= Math.min(firstArr.length, secArr.length);

        if (firstArr.length == secArr.length) {


                if (firstArr[0].charAt(0) <= secArr[0].charAt(0)) {
                    System.out.println(String.join("", firstArr));
                    System.out.println(String.join("", secArr));
                } else {
                    System.out.println(String.join("", secArr));
                    System.out.println(String.join("", firstArr));
                }

        }


    }

}



