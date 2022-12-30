package week_7_homework;
//Same as above program-8 using switch statement.

public class Ans11 {
    public static void main(String[] args) {
        String city = "D";
        switch (city) {
            case "A":
                System.out.println("London");
                break;
            case "B":
                System.out.println("India");
                break;
            case "C":
                System.out.println("Canada");
                break;
            case "D":
                System.out.println("Japan");
                break;
            case "E":
                System.out.println("China");
                break;
            case "F":
                System.out.println("russia");
                break;
            default:
                System.out.println("Invalid Entry");


        }
    }
}