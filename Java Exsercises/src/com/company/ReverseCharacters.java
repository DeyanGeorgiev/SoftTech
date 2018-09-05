package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class ReverseCharacters {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input1 = bf.readLine();
        String input2 = bf.readLine();
        String input3 = bf.readLine();

        ArrayList<String> arr = new ArrayList<String>();


        arr.add(input1);
        arr.add(input2);
        arr.add(input3);


        Collections.reverse(arr);

        for (String a :
                arr) {
            System.out.print(a);
        }

    }
}
