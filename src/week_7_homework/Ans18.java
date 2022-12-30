package week_7_homework;
//18. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”

public class Ans18 {
    public static void main(String[] args) {
        int num = 6;

        if (num>0){
            System.out.println("positive");

        }else {
            if(num<0) {
                System.out.println("negative");

            }else {
                System.out.println("Zero");
            }
        }
    }

}
