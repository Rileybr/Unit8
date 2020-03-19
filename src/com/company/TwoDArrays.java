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
    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(sumAll(arr));
    }
}
