package day_03;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        long result = Factorial(n);

        System.out.println("Factorial of " + n + " is " + result);
    }

    public static long Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * Factorial(n - 1);
        }
    }


}
