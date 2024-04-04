/*
Write a Java program to take two numbers x and y as input and perform the following
operation using the Math library.
a. Find the maximum between x and y
b. Find the minimum between x and y
c. Find xy
d. Find
e. Generate a random number between 10 and 100
*/

import java.util.*;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("xy: " + (x * y));
        System.out.println("Sqrt x: " + Math.sqrt(x));
        int random = (int) (Math.floor(Math.random() * (max - min) + min));
        System.out.println("Random Number: " + random);
    }
}
