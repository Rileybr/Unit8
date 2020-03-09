package com.company;

public class FourByFour {
    public static void main(String [] args) {
//code to define an initially empty int 2D array,
//minimum size 4x4
    int [][] nums = new int[4][4];
//code to output all original values
        System.out.print(nums[0][0]);
        System.out.print(nums[0][1]);
        System.out.print(nums[0][2]);
        System.out.print(nums[0][3]);
        System.out.println();
        System.out.print(nums[1][0]);
        System.out.print(nums[1][1]);
        System.out.print(nums[1][2]);
        System.out.print(nums[1][3]);
        System.out.println();
        System.out.print(nums[2][0]);
        System.out.print(nums[2][1]);
        System.out.print(nums[2][2]);
        System.out.print(nums[2][3]);
        System.out.println();
        System.out.print(nums[3][0]);
        System.out.print(nums[3][1]);
        System.out.print(nums[3][2]);
        System.out.print(nums[3][3]);

//code to change half the values to even positive numbers
        for (int i = 0; i < 2; i++){
            for (int x = 0; x < 4; x++){
                nums[i][x] = 2;
            }
        }
//and the other half to negative odd numbers
        for (int i = 2; i < 4; i++){
            for (int x = 0; x < 4; x++){
                nums[i][x] = -1;
            }
        }
//code to output a blank line separating output sets
        System.out.println("\n");
//code to output all array elements
        System.out.print(nums[0][0]);
        System.out.print(nums[0][1]);
        System.out.print(nums[0][2]);
        System.out.print(nums[0][3]);
        System.out.println();
        System.out.print(nums[1][0]);
        System.out.print(nums[1][1]);
        System.out.print(nums[1][2]);
        System.out.print(nums[1][3]);
        System.out.println();
        System.out.print(nums[2][0]);
        System.out.print(nums[2][1]);
        System.out.print(nums[2][2]);
        System.out.print(nums[2][3]);
        System.out.println();
        System.out.print(nums[3][0]);
        System.out.print(nums[3][1]);
        System.out.print(nums[3][2]);
        System.out.print(nums[3][3]);
    }
}
