package ru.geekbrains.less02;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1, 0, 0, 1, 0, 1, 1, 1, 1, 0};
        swap(arr);
        System.out.println(Arrays.toString(arr));

        int [] arr8numbers = new int[8];
        increase(arr8numbers);
        System.out.println(Arrays.toString(arr8numbers));

        int [] arrMult = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplier(arrMult);
        System.out.println(Arrays.toString(arrMult));

        int [][] matrix = new int[4][4];
        diag1matrix(matrix);
        for(int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));

        int [] minMaxArr = {8, 3, 2, 5, 0, 1, 9, 4, 7, 6};
        System.out.println("Min = " + minarr(minMaxArr) + ", Max = " + maxarr(minMaxArr));

        int [] array = {5, 1, 2, 3, 4, 1};
        System.out.println(checkBalance(array));

        int [] arrShift = {1, 2, 3, 4, 5, 6, 7, 8};
        shift(arrShift, 2);
        System.out.println(Arrays.toString(arrShift));


    }
    private static void swap(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
    private static void increase(int [] arr8numbers){
        for(int i = 0; i < arr8numbers.length; i++){
            arr8numbers[i] = i*3;
        }
    }
    private static void multiplier(int [] arrMult){
        for(int i = 0; i < arrMult.length; i++){
            if(arrMult[i] < 6)
                arrMult[i] *= 2;
        }
    }
    private static void diag1matrix(int [][] matrix){
        int reverse = matrix.length-1;
        for(int i = 0; i < matrix.length; i++){
            matrix[i][i] = 1;
            matrix[i][reverse-i] = 1;
        }
    }
    private static int minarr(int [] minMaxArr){
        int min = 0;
        for(int i = 0; i < minMaxArr.length; i++){
            if(minMaxArr[i] < min)
                min = minMaxArr[i];
        }
        return min;
    }
    private static int maxarr(int [] minmaxarr){
        int max = 0;
        for(int i = 0; i < minmaxarr.length; i++){
            if(minmaxarr[i] > max)
                max = minmaxarr[i];
        }
        return max;
    }
    private static boolean checkBalance(int [] array){
        int sumleft = 0, sumright = 0;
        for(int i = 0; i < array.length - 1; i++){
            sumleft += array[i];
            for(int j = 1; j < array.length; j++)
                sumright += array[j];
            if(sumleft == sumright)
                return true;
            sumright = 0;
        }
        return false;
    }
    private static void shift(int [] arrShift, int n){
        for(int i = 0; i < n; i++)
        {
            int temp = arrShift[0];
            for(int j = 0; j < arrShift.length - 1; j++)
                arrShift[j] = arrShift[j+1];
            arrShift[arrShift.length - 1] = temp;
        }
    }
}
