import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int fib0 = 0;
        int fib1 = 1;
        int fib2 = 0;

        System.out.println(fib0 + "\n" + fib1);
        for (int i =2; i <= num; i++){
            fib2 = fib0 + fib1 ;
            System.out.println(fib2);
            fib0 = fib1;
            fib1 = fib2;
        }
    }
}
