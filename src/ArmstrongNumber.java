import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int no= sc.nextInt();

        int n = no;
        int copy = no;
        int count = 0;
        int sum = 0;

        while(n!=0){
            count ++ ;
            n = n/10;
        }

        while(copy!=0){
            int rem = copy%10;
            sum += Math.pow(rem, count);
            copy = copy/10;
        }

        if(no == sum){
            System.out.println("Given Number Is Armstrong Number");
        }else{
            System.out.println("Not a armstrong number");
        }

    }
}
