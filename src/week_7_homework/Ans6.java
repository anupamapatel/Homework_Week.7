package week_7_homework;
import java.util.Scanner;
//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PF
//Print in following format

import java.util.Scanner;

public class Ans6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bp, HRA,TA,DA,PF, GP, NP;
        System.out.println("Enter Basic Salary:");
        bp = in.nextDouble();
        HRA = 10.0/100.0 *  bp;
        TA= 9.0/100.0 * bp;
        DA= 8.0/100.0 * bp;
        PF= 20.0/100.0* bp;
        GP = bp + HRA + TA + DA+ PF;
        NP = GP - PF;
        System.out.println("Gross Salary:"  + HRA);
        System.out.println("Net Pay:"    + TA);




    }

}
