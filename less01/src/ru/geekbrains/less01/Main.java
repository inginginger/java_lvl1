package ru.geekbrains.less01;

public class Main {

    public static void main(String[] args) {
        //variables initialization
        byte bVar = 8;
        short sVar = 1024;
        int iVar = 128;
        long lVar = 1073741824L;
        float fVar = 15.8f;
        double dVar = 3.14159265;
        boolean boolVar = false;
        char cVar = 'T';

        System.out.println("The calculation result = " + CalcTheExpression(3, 7, 12, 4));
        System.out.println("The presence in a given of values range: " + SumDomain(13, 2));
        PositiveNegativeNum(-8);
        System.out.println("Negative result: " + Negative(-2));
        Welcome("Nansy");
        if(LeapYear(2020)) {
            System.out.println("Is leap year");
        } else{
            System.out.println("Non-leap year");
        }
    }

    public static int CalcTheExpression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean SumDomain(int FirstVal, int SecondVal) {
        int sum = FirstVal + SecondVal;
        return sum >= 10 && sum <= 20;
    }

    public static void PositiveNegativeNum(int number) {
        if (number >= 0)
            System.out.println(number + " is positive number");
        else
            System.out.println(number + " is negative number");
    }

    public static boolean Negative(int value){
        return value < 0;
    }

    public static void Welcome(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static boolean LeapYear(int year){

        return ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0));
    }

}
