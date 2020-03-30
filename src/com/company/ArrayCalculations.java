package com.company;

public class ArrayCalculations {
    public static int rowSum(int[][] arr, int row) {
        // create a variable to keep track of the total
        int total = 0;

        // check to see if the given row variable is valid.
        if (row > arr.length || row < 0){
            return -1;
        }
        else {
            for (int i = 0; i < arr[row].length; i++){
                total += arr[row][i];
            }
            return total;
        }
// If the row is less than 0 or is greater than
        // the number of rows it is not valid. Return -1 if not valid.



        // if row is valid, create a loop to calculate the sum. hint:
// elements in a 2D array are found like 
// this arr[row][column]. If you are finding the sum of a row, 
// the [row] number will not change
// only the [column] part will.


// return the total
    }

}
