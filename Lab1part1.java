package javaLab;

import java.util.Random;
import java.util.Scanner;

public class Lab1part1 {

	public static void compareNum() {
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random();
		int number1;
		int number2;
		int digit;
		int length1;
		int length2;
		int i;
		int sum = 0;
		int compareNum = 99;
		boolean isTheSame = false;

		digit = randGen.nextInt(10 - 2) + 2; // Generating random digit number 2- 9 for user.
		do {
			System.out.println("please enter two different " + digit + " digit numbers.");
			while (!scnr.hasNextInt()) {
				System.out.println("Invalid entry!");
				System.out.println("please enter two different " + digit + " digit numbers.");
				scnr.next();// validate the number entered are integer.
			}
			number1 = scnr.nextInt(); // user enter first number with the shown digit
			while (!scnr.hasNextInt()) {
				System.out.println("Invalid entry!");
				System.out.println("please enter two different" + digit + " digit numbers.");
				scnr.next();
			}
			number2 = scnr.nextInt();// user enter second number with the shown digit

			length1 = String.valueOf(number1).length();
			length2 = String.valueOf(number2).length();
		} while ((length1 != digit) || (length2 != digit) || (number1 == number2));
		// validate the numbers according to requirements.
		// advance prompts: adding one more comment "number entered doesn't not meet
		// requirement." for re-enter the number

		for (i = 0; i < digit; i++) { // getting each number on entered number.
			int int1 = Character.getNumericValue(String.valueOf(number1).charAt(i));
			int int2 = Character.getNumericValue(String.valueOf(number2).charAt(i));
			sum = (int1 + int2); // getting sum for each digit.

			// System.out.println("The sum is " + sum);

			if (compareNum == 99) {
				compareNum = sum; // getting the sum at the first time
			} else if (compareNum != sum) { // any sum unequal to previous one.
				isTheSame = false;
				break;
			} else {// sum = compareNum
				isTheSame = true;
			}
		}
		System.out.println(isTheSame);
		scnr.close();

	}

	public static void main(String[] args) {
		compareNum();

	}

}
