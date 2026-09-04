package day_04;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }

        System.out.println("Max Value is  " + Max);
        System.out.println("Min Value is  " + Min);
    }
}