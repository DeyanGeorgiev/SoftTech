package com.company;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class P24_BookLibrary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = Integer.parseInt(in.nextLine());

        Book books = new Book();
        Libraryes library = new Libraryes();

        Map<String, Double> map = new TreeMap<>();

        for (int i = 0; i < input; i++) {


            String[] data = in.nextLine().split(" ");

            books.setName(data[1]);
            library.setPriceSum(Double.parseDouble(data[5]));


            if (!map.containsKey(books.name)) {
                map.put(books.name, library.priceSum);
            } else {

                double value = map.get(books.name);

                value += library.priceSum;

                map.put(books.name, value);

            }


        }

        DecimalFormat df = new DecimalFormat("#.00");

        for (Map.Entry kvp : map.entrySet()
                .stream()
                .sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
                .collect(Collectors.toList())
        ) {

            System.out.println(kvp.getKey() + " -> " + df.format(kvp.getValue()));

        }

    }

}


class Books {
    private String title;
    public String name;
    public double price;
    private Date releaseDate;


    public Books(String title, String name, double price, Date releaseDate) {
        this.name = name;
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
    }


    public Books() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void getTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void getPrice(double price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void getReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}

class Library {
    public String name;
    public double priceSum;

    public Library(String name, double priceSum) {
        this.name = name;
        this.priceSum = priceSum;
    }

    public Library() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceSum() {
        return priceSum;
    }

    public void setPriceSum(double priceSum) {
        this.priceSum = priceSum;
    }

}

