package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanVariable {

    public static void main(String[] args) throws IOException {


        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String string= bf.readLine();


        if (string.equals("True")){
            System.out.println("Yes");
        }else if (string.equals("False")){
            System.out.println("No");
        }

    }
}
