package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P23_AverageGrades {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int input = Integer.parseInt(in.nextLine());

        Student student = new Student();

        Map<String, Double> map = new TreeMap<>();

        for (int i = input; i > 0; i--) {

            String[] data = in.nextLine().split(" ");
            student.name = data[0];

            String[] grades = Arrays.copyOfRange(data, 1, data.length);
            double[] literate = new double[grades.length];

            for (int j = 0; j < grades.length; j++) {
                double num = Double.parseDouble(grades[j]);

                literate[j] = num;
            }

            student.grades = literate;


            map.put(student.name, student.getAverage());


        }


        for (Map.Entry s : map.entrySet()) {

           double value= Double.parseDouble(s.getValue().toString());

            if (value >= 5.00) {
                DecimalFormat df= new DecimalFormat("#.00");
                System.out.println(s.getKey() + " -> " + df.format(value));

            }

        }


    }
}

class Student {

    public String name;
    public double[] grades;


    public Student() {
    }

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double getAverage() {
        return calAverage(grades);
    }


    public static double calAverage(double[] grades) {

        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];

        }


        double result = sum / grades.length * 1.0;

        return result;
    }
}
