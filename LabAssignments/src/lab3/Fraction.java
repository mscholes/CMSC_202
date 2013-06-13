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
	public Fraction( int n, int d )
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
	
	/**
	 * Returns a String representation of this Fraction.
	 * Precondition: None
	 * Postcondition: None
	 * @param None
	 * @return A String representation of this Fraction
	 */
	public String toString()
	{
		String str = " \n";
		
		str += numerator;
		str += "/";
		str += denominator;
		
		return str;
		
	}
	
	/**
	 * Returns a decimal representation of this Fraction.
	 * Precondition: None
	 * Postcondition: None
	 * @param None
	 * @return A decimal representation of this Fraction
	 */	
	public double decimalValue()
	{		
		double dcml_n = (double)numerator;
		double dcml_d = (double)denominator;
		
		double dcml = dcml_n / dcml_d;
		
		return dcml;
	}
	
	/**
	 * Multiplies this Fraction by a given Fraction.
	 * Precondition: None
	 * Postcondition: None
	 * @param None
	 * @return The resultant Fraction of multiplying 2 Fractions.
	 */	
// Why is the form 
//		'public Fraction multiply()'
// used this time? Last it was
//		'public double decimalValue()'
// and
//		'public String toString()'
// 
// If it's typecasting, where did the 'Fraction' type come from?
// Did we create it with the constructor?
	public Fraction multiply( Fraction otherFraction )
	{
		int prodNum = numerator   * otherFraction.getNumerator();
		int prodDen = denominator * otherFraction.getDenominator();
// Is this why we made our accessors?
// If we hadn't, how would I get the numerator and denominator values of otherFraction?
		
		Fraction multipliedFraction = new Fraction(prodNum, prodDen);
		
		return multipliedFraction;	
	}
	
	
	/**
	 * !!!!BONUS!!!!! Reduces the Fraction using the Euclidean algorithm.
	 * BOOM! Recursion baby :)!
	 * Precondition: None
	 * Postcondition: None
	 * @param None
	 * @return A decimal representation of this Fraction
	 */
	public Fraction reduce()
	{
		int big;
		int small;
		if (denominator >= numerator)
		{
			big   = denominator;
			small = numerator;
		} else {
			small = denominator;
			big   = numerator;
		}
		return new Fraction(numerator/gcd(big,small), denominator/gcd(big,small));
	}
	
	public int gcd(int big, int small){
		if (small == 0) {
			return big;
		} else {
			return gcd(small, big % small);
		}
	}
}
