package week_7_homework;
//Write a program that tells us input value is number or an alphabet or symbol.
public class Ans14 {
    public static void main(String[] args) {
        char ch = '1';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '1' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Character");
        }
    }
}
