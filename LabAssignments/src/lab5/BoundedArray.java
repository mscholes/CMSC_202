package lab5;
import java.util.Scanner;

/**
 *	BoundedArray implements an array of integers with values 
 *		between a specified minimum and maximum range.
 *
 *	Class Invariants:
 * 	'minVal' must be less than or equal to 'maxVal'
 *	All values of the array must be in the range
 *		'minVal' and 'maxVal' INCLUSIVE
 *	@author
 *	@version Oct 7th, 2012
 *	@project CMSC 202 - Fall 2012 - Lab #5
 *	@section #
 *
 */
public class BoundedArray {
	private int array[];
	private int minVal;
	private int maxVal;
	
	/**
	 * Assigns the instance variable array reference to 
	 * point to the incoming array reference. Also assigns the 
	 * range values.
	 * Precondition: The input array to the constructor cannot be null.
	 * Precondition: 'minVal' must be less than or equal to 'maxVal'
	 * Precondition: All values of the array must be in the range
	 *               'minVal' and 'maxVal' INCLUSIVE
	 * @param array The input array to be searched on.
	 * @param minVal The minimum allowed value in the array.
	 * @param maxVal The maximum allowed value in the array.
	 */
	public BoundedArray(int[] array, int minVal, int maxVal) {
		
		//Precondition #1 The input array to the constructor cannot be null.
		if(array==null){
			throw new NullPointerException("Constructor precondition " +
					"not met: Input array cannot be null");
		}
		
		//Precondition #2 'minVal' must be less than or equal to 'maxVal'
		if(maxVal<minVal){
			throw new RuntimeException("Constructor precondition " +
					"not met: 'minVal' IS NOT less than or equal to 'maxVal'.");
		}
		
		// Precondition #3 All values of the array must be in the range
		//                  'minVal' and 'maxVal' INCLUSIVE
		
		for(int value : array){
			if ((value<minVal) || (value>maxVal)){
				throw new RuntimeException("Constructor precondition " +
						"not met: All values of array ARE NOT in the range " +
						"'minVal' and 'maxVal' INCLUSIVE.");
			}
		}
		
		// Initialize the "member instance variables"
		this.array=array;
		this.minVal=minVal;
		this.maxVal=maxVal;
	}
	
	
	/**
	 * Method to determine if element 'x' resides within the array.
	 * Precondition: value of 'x' must be in range 'minVal' and 'maxVal' INCLUSIVE
	 * Postcondition: returns true:   if the array contains 'x'
	 *                returns false:  otherwise
	 * @param x The number to be searched
	 * @return  True if the array contains 'x', false otherwise
	 */
	public boolean contains(int x){
	
		// Check for the 'contains()' preconditions
		// Precondition #1 Element x must be in the range 'minVal' and 'maxVal'
		//				   INCLUSIVE
		if ((x<minVal) || (x>maxVal)){
			throw new RuntimeException("Constructor precondition " +
					"not met: Element x IS NOT in the range " +
					"'minVal' and 'maxVal' INCLUSIVE.");
		}
			
		boolean found=false;
		int i=0;
		while((found==false) && (i<=(array.length-1))){
			if(array[i]==x){
				// We found the element at position i
				return true;
			}
			i++;
		}
		// We did not find the element
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Welcome to the BoundedArray Unit Tester");
		System.out.println("What would you like to test?");
		System.out.println("Case 1:  Constructor array=null");
		System.out.println("Case 2:  Constructor minVal>maxVal");
		System.out.println("Case 3:  Constructor array elements < minVal");
		System.out.println("Case 4:  Constructor array elements > maxVal");
		System.out.println("Case 5:  Constructor General Case (happy path #1)");
		System.out.println("Case 6:  Constructor Edge Case (happy path #2)");
		System.out.println("Case 7:   contains(x), where x < minVal");
		System.out.println("Case 8:   contains(x), where x > maxVal");
		System.out.println("Case 9:   contains(x), where 'x' is found");
		System.out.println("Case 10:  contains(x), where 'x' is not found");
		System.out.println("Case 11:  contains(x), where 'x' equal to 'minVal'");
		System.out.println("Case 12:  contains(x), where x equal to 'maxVal'");
		System.out.print("Please type which test case to run: ");
		int button = input.nextInt();

		System.out.println("--------------------");
		System.out.println("- Case "+button+" Result:");
		System.out.println("--------------------");
		
		/*
		 *Enter test case to check class invariant #2 
		 */
		switch (button)
		{
			case 1:
			{
				// 1:  Constructor array=null
				System.out.println("Passing null array. Expecting error statement.");
				int[] testArray=null;
				BoundedArray b=new BoundedArray(testArray, 0, 100);
			}
			break;
			case 2:
			{
				// 2:  Constructor minVal>maxVal
				System.out.println("Passing minVal>maxVal. Expecting error statement.");
				int[] testArray={1,2,3,4,5};
				BoundedArray b=new BoundedArray(testArray, 10, 9);
			}
			break;
			case 3:
			{
				// 3:  Constructor array elements < minVal
				System.out.println("Passing array elements < minVal. Expecting error statement.");
				int[] testArray={3,4,5};
				BoundedArray b=new BoundedArray(testArray, 9, 10);
			}
			break;
			case 4:
			{
				// 4:  Constructor array elements > maxVal
				System.out.println("Passing array elements > maxVal. Expecting error statement.");
				int[] testArray={3,4,5};
				BoundedArray b=new BoundedArray(testArray, 1, 2);
			}
			break;
			case 5:
			{
				// 5: Constructor General Case (happy path #1)
				System.out.println("General test case for constructor (happy path)");
				int[] testArray={-5,-6,0,-1,3,6,7,-2,2,3,4,7,-8};
				BoundedArray b=new BoundedArray(testArray, -9, 10);
				System.out.println("\tBoundedArray object successfully initialized");
			}
			break;
			case 6:
			{
				// 6: Constructor Edge Case (happy path #2)
				System.out.println("Edge case for constructor. Array values " +
						"exactly on range limits");
				int[] testArray={-5,-9,0,-1,3,6,7,-2,2};
				BoundedArray b=new BoundedArray(testArray,-9,7);
				System.out.println("\tBoundedArray object successfully initialized");
			}
			break;
			case 7:
			{
				// 7:  contains(x), where x < minVal
				System.out.println("Passing x < minVal. Expecting error statement.");
				int[] testArray={-5,-9,0,-1,3,6,7,-2,2};
				BoundedArray b=new BoundedArray(testArray,-9,7);
				
				int testElement=-10;
				boolean containsTestElement = b.contains(testElement);
			}
			break;
			case 8:
			{
				// 8:  contains(x), where x > maxVal
				System.out.println("Passing x > maxVal. Expecting error statement.");
				int[] testArray={-5,-9,0,-1,3,6,7,-2,2};
				BoundedArray b=new BoundedArray(testArray,-9,7);
				
				int testElement=10;
				boolean containsTestElement = b.contains(testElement);
			}
			break;
			case 9:
			{
				// 9:  contains(x), where 'x' is found
				System.out.println("General test case for 'contains()' method " +
						"(happy path). Passing x where 'x' is found. " +
						"Expecting 'true'.");
				int[] testArray={-5,-9,0,-1,3,6,7,-2,2};
				BoundedArray b=new BoundedArray(testArray,-9,7);
				
				int testElement=2;
				boolean containsTestElement = b.contains(testElement);
				System.out.println("x is in the testArray?: "+containsTestElement);
			}
			break;
			case 10:
			{
				// 10:  contains(x), where 'x' is not found
				System.out.println("General test case for 'contains()' method " +
						"(happy path). Passing x where 'x' is not found. " +
						"Expecting 'false'.");
				int[] testArray={-5,-9,0,-1,3,6,7,-2,2};
				BoundedArray b=new BoundedArray(testArray,-9,7);
				
				int testElement=1;
				boolean containsTestElement = b.contains(testElement);
				System.out.println("x is in the testArray?: "+containsTestElement);
			}
			break;
			case 11:
			{
				// 11:  contains(x), where 'x' equal to 'minVal'
				System.out.println("Edge case for 'contains()' method. " +
						"x value is exactly on the lower range limit.");
				int[] testArray={-5,-9,0,-1,3,6,7,-2,2};
				BoundedArray b=new BoundedArray(testArray,-9,7);
				
				int testElement=-9;
				boolean containsTestElement = b.contains(testElement);
				System.out.println("\tValue inclusion successfully evaluated.");
			}
			break;
			case 12:
			{
				// 12:  contains(x), where x equal to 'maxVal'
				System.out.println("Edge case for 'contains()' method. " +
						"x value is exactly on the upper range limit.");
				int[] testArray={-5,-9,0,-1,3,6,7,-2,2};
				BoundedArray b=new BoundedArray(testArray,-9,7);
				
				int testElement=7;
				boolean containsTestElement = b.contains(testElement);
				System.out.println("\tValue inclusion successfully evaluated.");
			}
			break;
			default:
				System.out.println("Case #"+button+" does not exist" +
						", please type a better number.");
			break;
		}
	}
}

