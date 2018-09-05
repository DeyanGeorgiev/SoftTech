package com.company;

import java.util.Scanner;

public class P16_URLParser {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String input = in.nextLine();


        String nextOperants = "";

        String protocol = "";
        String server = "";
        String resourse = "";


        if (input.contains("://")) {

            String[] firstOperant = input.split("://");
            protocol = firstOperant[0];
            nextOperants = firstOperant[1];

        }

        if (nextOperants.contains("/")) {
            String[] secondOperant = nextOperants.split("/", 2);
            resourse = secondOperant[1];

            server = secondOperant[0];
        } else {
            server = nextOperants;
        }


        System.out.println("[protocol] = \"" + protocol + "\"");
        System.out.println("[server] = \"" + server + "\"");
        System.out.println("[resource] = \"" + resourse + "\"");


    }

}
