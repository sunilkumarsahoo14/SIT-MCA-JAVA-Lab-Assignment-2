/*
Write a Java program to display greetings messages for a user. Take the username as
input at run time. Define a method of public void greet (String name) to operate.
*/

import java.util.Scanner;

class Q1 {
	public void Greet(String name) {
		System.out.println("Welcome " + name);
	}

	public static void main(String[] args) {
		System.out.println("Enter Your Name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Q1 g = new Q1();
		g.Greet(name);
	}
}
