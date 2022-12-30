package week_7_homework;

import java.util.Scanner;

public class Ans_5 {
    public static void main(String[] args) {
        int maths , science, english;
        String name;
        double div;
        Scanner in = new Scanner(System.in);
        System.out.println("         Enter your name======>");
        name = in.nextLine();
        System.out.println("         Enter your roll_number");
        int roll = in.nextInt();
        System.out.println("Enter your Math Marks==>");
        maths = in.nextInt();
        System.out.println("Enter your science Marks==>");
        science = in.nextInt();
        System.out.println("Enter your english Marks==>");
        english = in.nextInt();
        int sum = maths + science + english;
        div = sum/3;
        System.out.println("---------------------------------------");
        System.out.println("Subject"+"                               Marks");
        System.out.println("---------------------------------------");
        System.out.println("Maths"+"                                 Marks");
        System.out.println("science"+"                               Marks");
        System.out.println("english"+"                               Marks");
        System.out.println("---------------------------------------");





    }
}
