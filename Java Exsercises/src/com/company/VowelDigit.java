package com.company;

import java.util.Scanner;

public class VowelDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char in = scanner.nextLine().charAt(0);

        if (Character.isDigit(in)){
            System.out.println("digit");
        } else if(in == 'a'||
                in =='e'||
                in== 'o'||
                in== 'u'||
                in== 'i') {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("other");
        }
    }
}
