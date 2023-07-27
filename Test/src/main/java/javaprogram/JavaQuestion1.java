package javaprogram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class JavaQuestion1 {

	public static void main(String[] args) {

		// Declare an array numArray of 15 elements of type int.

		Scanner s = new Scanner(System.in);
		int[] numArray = new int[] { 2, 3, 4, 1, 5, 6, 7, 2, 8, 4, 1, 2, 5, 0, 9 };

		// Output the value of the tenth element of the array alpha.
/*
		for (int i = 0; i < numArray.length; i++) {
			System.out.println("All element are " + numArray[i]);
			System.out.println(" ");
			System.out.println("10th element of array is " + numArray[10]);
		}

		// Set the value of the fifth element of the array alpha to 35.
		Array.set(numArray, 4, 20);

		for (int i = 0; i < numArray.length; i++) {
			System.out.println("All element are " + numArray[i]);
		}
		*/
		// Set the value of the ninth element of the array alpha to the sum of the sixth
		// and thirteenth elements of the array alpha.
		int sum = 0;
		sum = sum + numArray[9] + numArray[4];
		System.out.println("Sum of sixth and thirteenth elements " + sum);
	}

}
