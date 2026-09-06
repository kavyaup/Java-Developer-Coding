package day_05;

import java.util.Scanner;

public class OddEvenThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();


        Runnable task = () -> {
            if (num % 2 == 0) {
                System.out.println(num + " is Even (checked by thread: " + Thread.currentThread().getName() + ")");
            } else {
                System.out.println(num + " is Odd (checked by thread: " + Thread.currentThread().getName() + ")");
            }
        };

        // Wrap it in a Thread and start it
        Thread t1 = new Thread(task);
        t1.start();
    }
}