package week_7_homework;
import java.util.Scanner;

/* Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)

 */

import java.util.Scanner;

public class Ans1 {
    public static void main(String[] args) {

        int a;
        System.out.println("Enter any Number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();

        if(a%2==0)
        {
            System.out.println("Even number");
        }
           else
           {
               System.out.println("Odd number");
           }
    }
}
