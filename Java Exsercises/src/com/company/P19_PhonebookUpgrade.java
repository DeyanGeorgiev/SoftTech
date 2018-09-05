package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P19_PhonebookUpgrade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        Map<String, String> map = new TreeMap<>();



        while (!input.equals("END")) {

            if( input.equals("ListAll")){

                map.forEach((k,v)-> System.out.println(k + " -> " + v));
                break;
            }

            String[] Arr = input.split(" ");

            String command = Arr[0];
            String name = "";
            String phone = "";
            try {

                name = Arr[1];
                phone = Arr[2];
            } catch (Exception e) {

            }


            switch (command) {

                case "A":

                    if (!map.containsKey(name)) {
                        map.put(name, phone);

                    } else {

                        map.replace(name, phone);
                    }
                    break;

            }



            input = in.nextLine();


        }

    }
}
