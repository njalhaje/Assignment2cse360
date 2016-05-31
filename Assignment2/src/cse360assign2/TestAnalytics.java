/*
 * Name:		Naser Alhajeri
 * PIN:			11
 * Description:	This class will calculate the mean, median, high and low value, and Number of integers in the array.
 */

package cse360assign2;

import java.util.Scanner;

/**
 * This is the main class
 * @author Naser Alhajeri
 *
 */
public class TestAnalytics 
{
	public static void main(String args[])
	{
		boolean debug = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Debug on? (type: y for yes, n for no)");
		String result = scan.nextLine ();
		debug = result.charAt (0) == 'y';

		Analytics a = new Analytics(debug);
		
		a.insert(5);
		a.insert(4);
		a.insert(3);
		a.insert(2);
		a.insert(1);
		a.insert(40);
		a.insert(30);
		a.insert(20);
		a.insert(10);
		
		a.print();
		
		System.out.println();
		System.out.println("Mean:\t" + a.mean());
		System.out.println("Median:\t" + a.median());
		System.out.println("High:\t" + a.high());
		System.out.println("Low:\t" + a.low());
		System.out.println("Number of Integers:\t" + a.numInts());
		
	}
}
