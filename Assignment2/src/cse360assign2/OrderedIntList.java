/*
 * Name:		Naser Alhajeri
 * PIN:			11
 * Description:	This class will insert numbers in an array, sort them in ascending order, and print the elements of the array.
 */

package cse360assign2;

/**
 * <P> This class will insert numbers in an array, sort them in ascending order, and print the elements of the array.
 * 
 * <P>PIN: 11
 * @author Naser Alhajeri
 * @version 1.0
 */
public class OrderedIntList 
{
	protected int[] numArray;  
	protected int count;
	private boolean debug = false;
	
	/**
	 * Default constructor
	 * @param debugging the code's debugging will depend on this variable equals.
	 */
	OrderedIntList (boolean debugging)
	{
		debug = debugging;
		numArray = new int[10];
	}
	
	/**
	 * This will insert the input into the array numArray
	 * @param input The number that is inputed by the user
	 */
	public void insert (int input) 
	{
		if(debug)
		{
			System.out.println("Debug - Starting insert");
			System.out.println("Debug - input = " + input);
		}
		
		if(count == numArray.length) 
			grow();
		
		if(count == 0)
		{
			numArray[0]= input;
			count++;
		}
		
		else 
		{
			int index = 0;
			int lastElement = 0;
			boolean found = false;
			
			while(!found && index < count)
			{
				if(input < numArray[index])
				{
					found = true;
				}
				
				if(found == false)
				{
					index++;
					lastElement++;
				}
			}
			
			for (index = count; index > lastElement; index--) 
			{
				numArray[index] = numArray[index-1];
				
				if(debug)
				{
					System.out.println("Debug - numArray[index] = " + numArray[index]);
				}
			}
			
			numArray[lastElement] = input; 
			count++;
		}
		
		if(debug)
		{
			System.out.println("Debug - ending insert");
		}
	}
	
	/**
	 * This will increase the size of the array numArray if it exceeds 10 numbers
	 */
	protected void grow()
	{	
		if(debug)
		{
			System.out.println("Debug - Starting grow");
		}
		
		int[] temp = new int[count*2];
		
		for(int index = 0; index < count; index++)
		{
			temp[index] = numArray[index];
			
			if(debug)
			{
				System.out.println("Debug - temp[index] = " + temp[index]);
			}
		}
		
		numArray = temp;
		
		if(debug)
		{
			System.out.println("Debug - Ending grow");
		}
	}
	
	/**
	 * This will print the numbers that are in the array numArray
	 */
	public void print() 
	{
		if(debug)
		{
			System.out.println("Debug - Starting print");
		}
		
		for (int index = 0; index < count; index++) 
		{
			if (index % 5 == 0) 
				System.out.println();
			
			if(debug)
			{
				System.out.println("\nDebug - numArray[index] = " + numArray[index]);
			}
			
			System.out.print(numArray[index] + "\t");	
		}
		
		System.out.println();
		
		if(debug)
		{
			System.out.println("Debug - Ending print");
		}
	}
}