package com.company;

import java.util.Random;
import java.util.Scanner;

public class P21_AdvertisementMessage {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int input = Integer.parseInt(in.nextLine());


        String[] phrases= new String[]{"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can't live without this product."};
        String[] events= new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author= new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities= new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};




        for (int i = input; i >0 ; i--) {

            System.out.printf("%s %s %s - %s%n", random(phrases), random(events), random(author), random(cities));

        }

    }

    private static String random (String[] strings){

        int rndm = new Random().nextInt(strings.length);

        String result = strings[rndm];

        return result;
    }


}
