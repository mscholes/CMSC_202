/**
 * TODO Class description
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version May 26, 2013
 *
 */
package lab3;

public class Fraction {
	
	// int representing the numerator and denominator of the Fraction.
	private int numerator;
	private int denominator;
	
	/**
	 * Constructs a new Fraction with a provided numerator and denominator
	 * Precondition: denominator must be gt 0
	 * Postcondition: None.
	 * @param n the numerator of the new Fraction
	 * @param d the denominator of the new Fraction
	 * @return None
	 */
	public Fraction( int n, int d)
	{
		//A Fraction  cannot have a 0 denominator.
		if (d == 0)
			throw new RuntimeException("Divide By Zero Exception");
		else
		{
			this.numerator   = n;
			this.denominator = d;
		}
	}
	
	/**
	 * Retrieves the value of the numerator
	 * Precondition: None
	 * Postcondition: None
	 * @param None
	 * @return An int representing the numerator
	 */
	public int getNumerator()
	{
		return numerator;
	}
	
	/**
	 * Retrieves the value of the denominator
	 * Precondition: None
	 * Postcondition: None
	 * @param None
	 * @return An int representing the denominator
	 */
	public int getDenominator()
	{
		return denominator;
	}
	
	// Stopped on 'Creating the toString method'
	

}
