package ru.geekbrains.less03;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int score = 0, cnt = 0;
        boolean w = true;
        Scanner yn = new Scanner(System.in);
        int num = (int) (Math.random() * 10);
        System.out.println("Guess a number in the range from 0 to 10");
        while(w) {
            int data = getNumber("Enter number in the range from 0 to 10 ", 0, 10);
            if(cnt < 3){
                if (data == num) {
                    score++;
                    System.out.println("Score " + score);
                    w = request("Continue the game?(Y/N)");
                }
                cnt++;
            }
            else {
                cnt = 0;
                w = request("Continue the game?(Y/N)");
            }
        }
        System.out.println("Score " + score);
    }
    private static int getNumber(String msg, int min, int max){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do{
            System.out.println(msg);
            x = sc.nextInt();
        }
        while(x < min && x > max);
        return x;
    }
    private static boolean request(String msg){
        String answ;
        Scanner yn = new Scanner(System.in);
        System.out.println(msg);
        answ = yn.nextLine();
        return answ.equals("Y") || answ.equals("y");
    }
}