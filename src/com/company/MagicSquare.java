/**
 * @author Brandon Riley
 * @since April 8, 20020
 * Checks if a 2D array is a magic square: the sum of all rows, columns, and diagonals are the same
 */
package com.company;

public class MagicSquare {
    private int[][] grid;

    /**
     * Initiates the 2D array that gets checked
     * @param g the 2D array
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     * Finds the sum of a given row
     * @param row the row we are finding the sum of
     * @return sum of given row
     */
    public int rowSum(int row) {
        // <<< Complete the code >>>
        int sum = 0;
        for (int i = 0; i < grid[row].length; i++){
            sum += grid[row][i];
        }
        return sum;
    }

    /**
     * Finds the sum of a given column
     * @param col the column we are finding the sum of
     * @return sum of given column
     */
    public int colSum(int col) {
        // <<< Complete the code >>>
        int sum = 0;
        for (int i = 0; i < grid[col].length; i++){
            sum += grid[i][col];
        }
        return sum;
    }

    /**
     * Finds the sum of the diagonal starting on the bottom left and ending on the top right
     * @return sum of the upward diagonal
     */
    public int upDiagSum() {
        // <<< Complete the code >>>
        int sum = 0;
        int row = 0;
        int col = grid.length-1;
        for (int i = 0; i < grid.length; i++){
            sum += grid[row][col];
            row++;
            col--;
        }
        return sum;
    }

    /**
     * Finds the sum of the diagonal starting on the top left and ending on the bottom right
     * @return sum of the downward diagonal
     */
    public int downDiagSum() {
        // <<< Complete the code >>>
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][i];
        }
        return sum;
    }

    /**
     * Finds the sum of every row, column and diagonal and checks if they are all equal
     * @return whether or not it is a true magic square
     */
    public boolean isMagicSquare() {
        // <<< Complete the code >>>
        int goal = rowSum(0);
        int size = grid.length;
        for (int i = 0; i < size; i++){
            if (rowSum(i)!= goal){
                return false;
            }
            else if (colSum(i) != goal){
                return false;
            }
            else if (downDiagSum() != goal){
                return false;
            }
            else if (upDiagSum() != goal){
                return false;
            }
        }
        return true;
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

