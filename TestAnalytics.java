/**
* File for testing Analytics.java
*
* @author Salim Alyafei PIN: 15
*/


package cse360assign2;

public class TestAnalytics extends OrderedIntList {

/**
*   Main method
*/
	public static void main(String [] args)
	{
		Analytics analytics = new Analytics();

		for(int i=30; i>0; i--)
			analytics.insert(i);

		System.out.println("Now all numbers from 1 to 30 should be printed");
		analytics.print();

		analytics.insert(40);
		analytics.insert(35);

		double obtainedMean = analytics.mean();
		double obtainedMedian = analytics.median();
		int obtainedMax = analytics.max();
		int obtainedMin = analytics.min();
		int obtainedCount = analytics.numInts();

		System.out.println("Testing mean: "+((obtainedMean == 16.875)?"Ok":"Bad"));
		System.out.println("Testing median: "+((obtainedMedian == 16.5)?"Ok":"Bad"));
		System.out.println("Testing min: "+((obtainedMin == 1)?"Ok":"Bad"));
		System.out.println("Testing max: "+((obtainedMax == 40)?"Ok":"Bad"));
		System.out.println("Testing count: "+((obtainedCount == 32)?"Ok":"Bad"));


		
	}


}