package week_7_homework;
//Declare multidimensional array and store 5 countries and their
//capital and print them in console.

public class Ans3 {
    public static void main(String[] args) {    //main method

        String name[][] = {{ "India"}, {"United kingdom"}, {"America"}, {"China"},{"Canada"}};
        String name1[][] = {{ "Delhi"}, {"London"}, {"Washington"}, {"Beijing"},{"Ottawak, "}};

        System.out.println(" The Country is :" + name [0][0] +"and" + "The capital is :" +name1 [0][0]);
        System.out.println(" The Country is :" + name [1][0] +"and" + "The capital is :" +name1 [1][0]);
        System.out.println(" The Country is :" + name [2][0] +"and" + "The capital is :" +name1 [2][0]);
        System.out.println(" The Country is :" + name [3][0] +"and" + "The capital is :" +name1 [3][0]);
        System.out.println(" The Country is :" + name [4][0] +"and" + "The capital is :" +name1 [4][0]);
    }
}
