package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 20 ;
        int garySalary = 30 ;
        System.out.println(Math.max(bobSalary, garySalary));

        int truckprice = 4000 ;
        int carprice = 2000 ;
        System.out.println(Math.min(carprice, truckprice));

        System.out.println(Math.PI * Math.pow(7.25, 2));

        System.out.println(Math.sqrt(5.0));

        System.out.println("(" + Math.subtractExact(85,5) + "," + Math.subtractExact(50, 10) + ")");

        System.out.println(Math.abs(-3.8));

        System.out.println(Math.random());

    }
}
