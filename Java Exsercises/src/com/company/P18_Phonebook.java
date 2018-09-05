package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P18_Phonebook {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        Map<String, String> map = new HashMap<>();


        while (!input.equals("END")) {

            String[] Arr = input.split(" ");

            String command = Arr[0];
            String name = Arr[1];
            String phone = "";
            try {
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

                case "S":

                    if (map.containsKey(Arr[1])) {

                        String value = map.get(name);

                        System.out.println(Arr[1] + " -> " + value);
                    } else {
                        System.out.println("Contact " + Arr[1] + " does not exist.");
                    }

                    break;
            }

            input = in.nextLine();


        }


    }
}
