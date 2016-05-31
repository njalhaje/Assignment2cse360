/*
 * Name:		Naser Alhajeri
 * PIN:			11
 * Description:	This class will calculate the mean, median, high and low value, and Number of integers in the array.
 */
package cse360assign2;

/**
 * <P>This class will calculate the mean, median, high and low value, and Number of integers in the array.
 * 
 * <P> PIN: 11
 * @author Naser Alhajeri
 *
 */
public class Analytics extends OrderedIntList
{
	
	/**
	 * Default Constructor
	 */
	Analytics(boolean debug)
	{
		super(debug);
	}
	
	/**
	 * This will calculate the mean of the numbers in the array
	 * @return the array's mean
	 */
	public double mean()
	{
		if(count == 0)
			return -1;
		
		double mean = 0;
		int sum = 0;
		
		for(int index = 0; index < count; index++)
		{
			sum = sum + numArray[index];
		}
		
		mean = (double) sum/count;
		
		return mean;
	}
	
	/**
	 * This will calculate the median of the numbers in the array
	 * @return the array's median
	 */
	public int median()
	{
		if(count == 0)
			return -1;
		
		int median = 0;
		int first = numArray[0];
		int last = numArray[count-1];
		
		median = (first + last)/2;
		
		return median;
	}
	
	/**
	 * This will get the highest value in the array
	 * @return the highest value in the array
	 */
	public int high()
	{
		if(count == 0)
			return -1;
		
		int high = numArray[count-1];
		
		return high;
	}
	
	/**
	 * This will get the lowest value in the array
	 * @return the lowest value in the array
	 */
	public int low()
	{
		if(count == 0)
			return -1;
		
		int low = numArray[0];
		
		return low;
	}
	
	/**
	 * This will get the number of integers in the array
	 * @return number of integers
	 */
	public int numInts()
	{
		if(count == 0)
			return -1;
		
		return count;
	}
}
