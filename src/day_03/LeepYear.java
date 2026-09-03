package day_03;

import java.util.Scanner;

public class LeepYear {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a year: ");
      int Year = sc.nextInt();

      boolean isLeep = true;

          if ( (Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0){
              isLeep = true;
          }else{
              isLeep = false;
          }

          if(isLeep){
              System.out.println(Year + " is a leepyear " );
          }else{
              System.out.println(Year + " is  not a leepyear " );
          }
      }

  }

