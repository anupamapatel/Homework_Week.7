package week_7_homework;
import java.util.Arrays;
import java.util.Scanner;
//Write a Java program to sort a numeric array and a string array.

public class Ans19 {
    public static void main(String[] args) {
        int [] arraydetail1 = {23,1,7,8,90,55,4,68};
        String [] arraydetail2 = {"Anupama","Mihir","Jivansh","Jivu","Usha"};
        System.out.println("original value: "+ Arrays.toString(arraydetail1));
        Arrays.sort(arraydetail1);
        System.out.println("sorted value: "+ Arrays.toString(arraydetail1));
        System.out.println("original value: "+ Arrays.toString(arraydetail2));
        Arrays.sort(arraydetail2);
        System.out.println("sorted value: "+ Arrays.toString(arraydetail2));


    }
}
