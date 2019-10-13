package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
////        int a = 0;
////        System.out.println("Enter size of rhombus:");
////        a = scanner.nextInt();
////
////
////        for(int i = 1; i <=a; i++){
////            for(int j = 10; j <=10+a ; j++ ){
////                System.out.print(" ");
////            } for(int k = 1; k <=a; k++){
////                System.out.print("*");
////            }
////            System.out.println(" ");
////        }

        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;


        System.out.println("Enter day: ");
        day = scanner.nextInt();


        System.out.println("Enter month: ");
        month = scanner.nextInt();

        if (day > 31 || day < 0) {
            System.out.println("Invalid Value ");
        }
        System.out.println(" ");


        switch (month) {

            case 1:
                if (day >= 1 && day <= 20) {


                    System.out.println("Capricorn");
                }

                if (day >= 21 && day <= 31) {
                    System.out.println("Aquarius");
                }
                break;


            case 2:
                if (day >= 20 && day <= 28) {


                    System.out.println("Pisces");
                }

                if (day <= 19 && day >= 1) {
                    System.out.println("Aguarius");
                }
                break;


            case 3:
                if (day >= 21 && day <= 31) {


                    System.out.println("Aries");
                }
                if (day >= 1 && day <= 20)
                    System.out.println("Pisces");
                break;


            case 4:
                if (day >= 1 && day <= 20) {


                    System.out.println("Aries");
                }
                if (day >= 21 && day <= 30) {
                    System.out.println("Taurus");
                }
                break;


            case 5:
                if (day >= 1 && day <= 21) {


                    System.out.println("Taurus");
                }
                if (day >= 22 && day <= 31) {


                    System.out.println("Gemini");
                }
                break;


            case 6:
                if (day >= 1 && day <= 21) {
                    System.out.println("Gemini");
                }
                if (day >= 22 && day <= 30) {
                    System.out.println("Cancer");
                }
                break;


            case 7:
                if (day >= 1 && day <= 22) {
                    System.out.println("Cancer");
                }
                if (day >= 23 && day <= 31) {
                    System.out.println(" Leo");
                }
                break;

            case 8:
                if (day >= 1 && day <= 23) {
                    System.out.println("Leo");
                }
                if (day >= 24 && day <= 31) {
                    System.out.println("Virgo");
                }
                break;

            case 9:
                if (day >= 1 && day <= 23) {
                    System.out.println("Virgo");
                }
                if (day >= 24 && day <= 30) {
                    System.out.println("Libra");
                }
                break;

            case 10:
                if (day >= 1 && day <= 23) {
                    System.out.println("Libra");
                }
                if (day >= 24 && day <= 31) {
                    System.out.println("Scorpio");
                }
                break;

            case 11:
                if (day >= 1 && day <= 22) {
                    System.out.println("Scorpio");
                }
                if (day >= 23 && day <= 30) {
                    System.out.println("Sagittarius");
                }
                break;

            case 12:
                if (day >= 1 && day <= 21) {
                    System.out.println("Sagittarius");
                }
                if (day >= 22 && day <= 31) {
                    System.out.println("Capricorn");
                }
                break;
            default:
                System.out.println("Invalid value");

        }


        scanner.close();
    }


}











