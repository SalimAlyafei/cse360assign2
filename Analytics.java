/**
* Implementation of a Ordered list of ints
*
* @author Salim Alyafei PIN: 15
*/


package cse360assign2;

public class Analytics extends OrderedIntList {

/**
*   Returns the mean of the elements in the list
*/
	public double mean()
	{
		if (count==0)
			return -1.0;
		int total = 0;
		for (int index = 0; index < count; index++)
		{
			total += array[index];
		}
		return (double)total / (double)count;
	}

/**
*   Returns the median of the elements in the list
*/
	public double median()
	{
		if (count==0)
			return -1.0;

		if(count % 2 == 1) // odd number of elements
		{
			return (double) array[count/2];
		}
		else  // even number of elements
		{
			return (array[count/2-1]+array[count/2])/2.0;
		}

	}

/**
*   Returns the max value of the elements in the list
*/
	public int max()
	{
		if (count==0)
			return -1;

		return array[count-1];
	}	

/**
*   Returns the min value of the elements in the list
*/
	public int min()
	{
		if (count==0)
			return -1;

		return array[0];
	}


/**
*   Returns the number of ints in the list
*/
	public int numInts()
	{
		return count;
	}



   /**
   * prints the contents of the list
   */		
	public void print () 
	{
		for (int index = 0; index < count; index++)
		{
			if (index % 5 == 0)           // print 5 columns
				System.out.println();

			System.out.print(array[index] + "\t");	// print next element
		}
		System.out.println();
	}
}
