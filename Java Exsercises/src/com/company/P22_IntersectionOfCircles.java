package com.company;

import java.util.Scanner;

public class P22_IntersectionOfCircles {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String[] firstData = in.nextLine().split(" ");
        String[] secData = in.nextLine().split(" ");

        Circle circle1 = new Circle(Integer.parseInt(firstData[0]), Integer.parseInt(firstData[1]), Integer.parseInt(firstData[2]));
        Circle circle2 = new Circle(Integer.parseInt(secData[0]), Integer.parseInt(secData[1]), Integer.parseInt(secData[2]));



        if (!isIntersect(circle1, circle2)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }


    }

    private static boolean isIntersect(Circle circle1, Circle circle2) {

        double distanceX= circle1.getX()- circle2.getX();
        double distanceY = circle1.getY()- circle2.getY();
        double distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
        double sumRadius = circle1.getR() + circle2.getR();
        if (distance > sumRadius) {
            return false;
        } else {
            return true;
        }


    }
}


class Circle {

    private int x;
    private int y;
    private int r;

    public Circle() {
    }

    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
