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
        // create a variable to keep track of the total
        int total = 0;

        // check to see if the given col variable is valid.
// If col is less than 0 or is greater than
        // the number of columns (the length of one array) it is not valid.
// Return -1 if not valid.
        if (col > arr[0].length || col < 0){
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++){
                total += arr[i][col];
            }
            return total;
        }


        // if col is valid, create a loop to calculate the sum. hint:
// elements in a 2D array are found like
// this arr[row][column]. If you are finding the sum of a col,
// the [column] number will not change
// only the [row] part will.


// return the total

    }

}
