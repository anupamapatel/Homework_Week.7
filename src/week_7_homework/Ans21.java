package week_7_homework;
import java.util.Scanner;

//Write a Java program to calculate the average value of array elements.

public class Ans21 {
    public static void main(String[] args) {
        int [] nums = {2,5,6,90,56,10};
        int sum = 0;
        for (int i = 0;i<nums.length;i++){
            sum+=nums[i];

        }
        float average = sum/ nums.length;
        System.out.println(average);
    }

}

