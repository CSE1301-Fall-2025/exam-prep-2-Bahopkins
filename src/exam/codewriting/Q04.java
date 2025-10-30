package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q04 {

	/*
	We wish to create a method to create and fill an array of doubles. Complete the fillDoubleArray
	method below by first creating an array of doubles of size n. You should then iterate through the array
	and fill it by reading doubles from the Scanner in parameter. The method should then return the filled
	array.
	 */
	public static double[] fillDoubleArray (int n, Scanner in) {
		double[] filledArray = new double[n];
		for (int i = 0; i < filledArray.length; i++) {
			filledArray[i] = in.nextDouble();
		}
		return filledArray;
	}

	/*
	We wish to make a program that draws user-defined polygons. You should first request the user to specify
	how many sides the polygon should have. Then, use the fillDoubleArray method from the previous
	part to create the two necessary arrays before drawing the polygon. The main method has already been
	started for you:
	 */
	public static void main ( String[] args ) {
		Scanner in = new Scanner ( System .in );
		//use StdDraw.polygon and fillDoubleArray
		System.out.println("How many side do you want your polygon to have?");
		int sides = in.nextInt();
		double[] xValues = fillDoubleArray(sides, in);
		double[] yValues = fillDoubleArray(sides, in);
		StdDraw.polygon(xValues, yValues);
	}
}
