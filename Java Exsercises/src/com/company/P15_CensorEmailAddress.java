package com.company;

import java.util.Scanner;

public class P15_CensorEmailAddress {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] email = in.nextLine().split("@");
        String text = in.nextLine();

        char[] replacable = email[0].toCharArray();


        String checkDomain= email[1];
        String needToChange = email[0]+"@"+checkDomain;




       String out= text.replaceAll(needToChange, replacement(replacable, checkDomain));

        System.out.println(out);


    }

    private static String replacement(char[] i, String domain) {

        String halfResult = "";

        for (int j = 0; j < i.length; j++) {

            halfResult = halfResult + "*";
        }

        String result = halfResult+"@"+domain;

        return result;
    }


}
