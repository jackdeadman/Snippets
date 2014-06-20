package math;

import java.util.Scanner;

public class Euclid {

	static Scanner numInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a positive integer: ");
	        int numOne = numInput.nextInt();
	        System.out.println("Enter another positive integer: ");
		int numTwo = numInput.nextInt();

		findDivisor(numOne,numTwo);

	}

	private static void findDivisor(int numOne, int numTwo) {

		int tempNum = 0;
		int smallerNum;

		if (numOne > numTwo) {
			smallerNum = numTwo;

			while (numOne > numTwo) {

				tempNum = numOne - numTwo;
				numOne = tempNum;
			}

		} else {

			smallerNum = numOne;

			while (numTwo > numOne) {

				tempNum = numTwo - numOne;
				numTwo = tempNum;

			}

		}

		if (smallerNum == tempNum) {

			System.out.println("the greatest common divisor is " + tempNum);

		} else {

			findDivisor(smallerNum, tempNum);

		}

	}

}
