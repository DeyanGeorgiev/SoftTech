//package com.company;
//
//import java.text.DateFormat;
//import java.text.DecimalFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//import java.util.stream.Collectors;
//
//public class P25_BookLibraryModification {
//
//
//    public static void main(String[] args) throws ParseException {
//        Scanner in = new Scanner(System.in);
//
//        int input = Integer.parseInt(in.nextLine());
//
//        Book books = new Book();
//        Libraryes libraryes = new Libraryes();
//
//        DateFormat dateFormat= new SimpleDateFormat("dd.MM.yyyy");
//
//        Map<String, Date> map = new TreeMap<>();
//
//        for (int i = 0; i < input; i++) {
//
//
//            String[] data = in.nextLine().split(" ");
//
//            books.getTitle(data[0]);
//            books.getReleaseDate(dateFormat.parse(data[3]));
//
//
//            if (!map.containsKey(books.name)) {
//                map.put(books.title, books.releaseDate );
//            } else {
//
//                double value = map.get(books.name);
//
//                value += libraryes.priceSum;
//
//                map.put(books.name, value);
//
//            }
//
//
//        }
//
//        DecimalFormat df = new DecimalFormat("#.00");
//
//        for (Map.Entry kvp : map.entrySet()
//                .stream()
//                .sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
//                .collect(Collectors.toList())
//        ) {
//
//            System.out.println(kvp.getKey() + " -> " + df.format(kvp.getValue()));
//
//        }
//
//    }
//}
//
//
//class Book {
//    public String title;
//    public String name;
//    public double price;
//    public Date releaseDate;
//
//
//    public Book(String title, String name, double price, Date releaseDate) {
//        this.name = name;
//        this.title = title;
//        this.price = price;
//        this.releaseDate = releaseDate;
//    }
//
//
//    public Book() {
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void getTitle(String title) {
//        this.title = title;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void getPrice(double price) {
//        this.price = price;
//    }
//
//    public Date getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void getReleaseDate(Date releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//}
//
//class Libraryes {
//    public String name;
//    public double priceSum;
//
//    public Libraryes(String name, double priceSum) {
//        this.name = name;
//        this.priceSum = priceSum;
//    }
//
//    public Libraryes() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPriceSum() {
//        return priceSum;
//    }
//
//    public void setPriceSum(double priceSum) {
//        this.priceSum = priceSum;
//    }
//
//}


//TODO: in process