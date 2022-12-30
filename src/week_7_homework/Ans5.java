package week_7_homework;
import java.util.Scanner;

public class Ans5 {
    public static void main(String[] args) {
        Scanner marks= new Scanner (System.in);
        int Math , Science, English;
        System.out.println("Enter the marks of maths");
        Math = marks . nextInt();
        System.out.println("Enter the marks of Science");
        Science = marks . nextInt();
        System.out.println("Enter the marks of English");
        English = marks . nextInt();

        float sum = Math+Science+English;

    }
}
