package com.company;

public class TwoDArrays {
    public static int maxValue(int[][] list){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++){
            for (int x = 0; x < list[1].length; x++){
                if (list[i][x] > max){
                    max = list[i][x];
                }
            }
        }
        return max;
    }
    public static int sumAll(int[][] list){
        int total = 0;
        for (int i = 0; i < list.length; i++){
            for (int x = 0; x < list[1].length; x++){
                total += list[i][x];
            }
        }
        return total;
    }

    public static boolean isSquare(int[][] list){
        if (list.length == list[1].length){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        int[][] arr1 = {{1, 2, 3, 4}, {6, 2, 5, 3}, {9, 0, 1, 7}, {3, 1, 8, 6}};
        int[][] arr2 = {{1, 6, 4}, {6, 2, 1}};
        System.out.println(isSquare(arr1));
        System.out.println(isSquare(arr2));
    }
}
