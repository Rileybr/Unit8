package com.company;

public class ArrayCalculations {
    public static int rowSum(int[][] arr, int row) {
        int total = 0;

        if (row > arr.length || row < 0){
            return -1;
        }
        else {
            for (int i = 0; i < arr[row].length; i++){
                total += arr[row][i];
            }
            return total;
        }

    }

    public static int columnSum(int[][] arr, int col) {
        int total = 0;

        if (col > arr[0].length || col < 0){
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++){
                total += arr[i][col];
            }
            return total;
        }
    }

    public static int diagonalSum(int[][] arr, int direction) {
        int total = 0;
        if (direction == 0 || direction == 1) {
            if (direction == 0) {
                for (int i = 0; i < arr.length; i++) {
                    total += arr[i][i];
                }
            }
            else if (direction == 1) {
                int row = 0;
                int col = arr.length-1;
                for (int i = 0; i < arr.length; i++){
                    total += arr[row][col];
                    row++;
                    col--;
                }
            }
            return total;
        }
        else{
            return -1;
        }
    }
}
