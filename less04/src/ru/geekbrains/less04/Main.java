package ru.geekbrains.less04;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static char [][] field = new char[5][5];
    static final int DOTS_TO_WIN = 4;

    static final char SYMB_X = 'X';
    static final char SYMB_O = 'O';
    static final char SYMB_EMPTY = '.';

    static final char PLAYER_SYMB = SYMB_X;
    static final char AI_SYMB = SYMB_O;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initField();
        printField();

        while(true){
            playerTurn();
            printField();
            if (checkWin(PLAYER_SYMB)){
                System.out.println("Player wins");
                break;
            }
            if(checkDraw()){
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printField();
            if(checkWin(AI_SYMB)){
                System.out.println("Computer wins");
                break;
            }
            if(checkDraw()){
                System.out.println("Draw");
                break;
            }
        }
    }
    //проверка на ничью
    private static boolean checkDraw(){
        for(int  i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++)
                if(field[i][j] == SYMB_EMPTY) return false;
        }
        return true;
    }
    //проверка на победу
    private static boolean checkWin(char sym){
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == sym) {
                    counter++;
                    if (counter == DOTS_TO_WIN) return true;
                } else {
                    counter = 0;
                }
            }
        }

        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == sym) {
                    counter++;
                    if (counter == DOTS_TO_WIN) return true;
                } else {
                    counter = 0;
                }
            }
        }

        // идем по верхней стороне вправо
        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (i + j >= field.length) break;
                if (field[j][i + j] == sym) {
                    counter++;
                    if (counter == DOTS_TO_WIN) return true;
                } else {
                    counter = 0;
                }
            }
        }
        // идем по левой стороне вниз
        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (i + j >= field.length) break;
                if (field[i + j][j] == sym) {
                    counter++;
                    if (counter == DOTS_TO_WIN) return true;
                } else {
                    counter = 0;
                }
            }
        }

        // идем по нижней стороне вправо
        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (i + j >= field.length) break;
                if (field[field.length - 1 - j][i + j] == sym) {
                    counter++;
                    if (counter == DOTS_TO_WIN) return true;
                } else {
                    counter = 0;
                }
            }
        }

        // идем по левой стороне вверх
        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (i + j >= field.length || field.length - 1 - j < 0) break;
                if (field[i + j][field.length - 1 - j] == sym) {
                    counter++;
                    if (counter == DOTS_TO_WIN) return true;
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }
    //ход ПК
    private static void aiTurn() {
        int x = -1, y = -1;
        if (x == -1 && y == -1) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (isCellValid(i, j)) {
                        field[j][i] = AI_SYMB;
                        if (checkWin(AI_SYMB)) {
                            x = i;
                            y = j;
                        }
                        field[j][i] = SYMB_EMPTY;
                    }
                }
            }
        }
        if (x == -1 && y == -1) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (isCellValid(i, j)) {
                        field[j][i] = PLAYER_SYMB;
                        if (checkWin(PLAYER_SYMB)) {
                            x = i;
                            y = j;
                        }
                        field[j][i] = SYMB_EMPTY;
                    }
                }
            }
        }
        if (x == -1 && y == -1) {
            do {
                x = random.nextInt(field.length);
                y = random.nextInt(field.length);
            } while (!isCellValid(x, y));
        }
        field[y][x] =  AI_SYMB;
    }
    //ход игрока
    private static void playerTurn() {
        System.out.println("Enter coordinats X Y >>>");
        int x = 0, y = 0;
        do {
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        field[y][x] = PLAYER_SYMB;
    }
    //проверка ячейки поля
    private static boolean isCellValid(int x, int y){
        if (x < 0 || y < 0 || x >= field.length || y >= field.length) return false;
        if (field[y][x] == SYMB_EMPTY) return true;
        return false;
    }
    //вывод поля на экран
    private static void printField(){
        for (int i = 0; i <= field.length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            System.out.printf("%2d ", (i + 1));
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf("%2c ", field[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    //инициализация поля
    private static void initField(){
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++)
                field[i][j] = SYMB_EMPTY;
        }
    }
}
