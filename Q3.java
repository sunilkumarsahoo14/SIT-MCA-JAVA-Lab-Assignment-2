/*
Write a Java program to perform the operation of a simple calculator (+, -, *, and /)
using a switch case statement. Input two operands and the operator at the run time.
*/

import java.util.*;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter Operation: ");
        System.out.println("1 - +");
        System.out.println("2 - -");
        System.out.println("3 - *");
        System.out.println("4 - /");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ans: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Ans: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Ans: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Ans: " + (num1 / num2));
                } else {
                    System.out.println("ERROR! Check The Input Data.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Input!");
        }

    }
}