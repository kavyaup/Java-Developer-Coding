package day_02;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while(num!=0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10 ;
        }
        if(rev == temp){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
