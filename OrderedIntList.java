/**
* Implementation of a Ordered list of ints
*
* @author Salim Alyafei PIN: 15
*/


package cse360assign2;

public class OrderedIntList {

	protected int[] array;        // stores the data
	protected int count;          // number of elements in the list
	private boolean debug;        // are we debugging?

   /**
   * Class constructor. Initializes the data array with space for 10 elements
   */	    
	OrderedIntList ()
	{
		array = new int[10];
	}

	/**
   * Inserts the given value in the list
   * @param value Value to be inserted in the list
   */
	public void insert (int value) 
	{
		if(count == array.length) grow();  // grow the array if it is already full

		if(count == 0)   // if we are inserting on an empty list...
		{
			array[0] = value;  // just insret the value
			count++;
		}
		else              // the list is not empty...
		{
			int index2 = 0;

			// first get the insertion point
			for (int index1= 0; index1 < count && value >= array[index1]; index1++)
				index2++;

			// now we open space for inserting the new element
			for (int index1 = count; index1 > index2; index1--) 
				array[index1] = array[index1 - 1];

			// insert the element and count it
			array[index2] = value; 
			count++;
		}
	}

   /**
   * grow: resizes the array when it is full
   */	 	
	private void grow()
	{
		int [] temp = new int[count * 2];  // new array to hold the data

		// copy old data in new array
		for (int i = 0; i < count; i++)
			temp[i] = array[i];

		array = temp;   // update the new array
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
