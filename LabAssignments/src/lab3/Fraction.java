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
		String str = " ";
		
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
	 * @param Fraction The given Fraction to be multiplied by.
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
		int prodNum = numerator   * otherFraction.numerator;
		int prodDen = denominator * otherFraction.denominator;
// Should I be using the accessors we made?
// If we hadn't made them, how would I get the numerator and denominator values of otherFraction?
		
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
	private int gcd(int big, int small){
		if (small == 0) {
			return big;
		} else {
			return gcd(small, big % small);
		}
	}

	/**
	 * Checks if Fraction is equal to a given Fraction.
	 * Precondition: None
	 * Postcondition: None
	 * @param Fraction The given Fraction to be check for equality by.
	 * @return String Are or aren't the same and/or equal.
	 */
	public String equals( Fraction otherFraction )
	{
		boolean sameness = false;
		boolean equality = false;
		if ((numerator == otherFraction.numerator) && (denominator == otherFraction.denominator))
		  sameness = true;
		
		if ((this.reduce().numerator   == otherFraction.reduce().numerator) &&
			(this.reduce().denominator == otherFraction.reduce().denominator))
		  equality = true;
		
		if ((sameness == equality) && (equality == false)) {
			return this.toString()+" & "+otherFraction.toString()+" are NEITHER the same NOR equal.";
		} else if ((sameness == equality) && (equality == true)) {
			return this.toString()+" & "+otherFraction.toString()+" are BOTH the same AND equal.";
		} else {
			return this.toString()+" & "+otherFraction.toString()+" are NOT the same BUT ARE equal.";
		}
	}
	/**
	 * They suggest this, which is clever:
	 */
//	public boolean equals(Fraction secondFraction) {
//	   if ((this.numerator * secondFraction.denominator) == (this.denominator* secondFraction.numerator))
//	    return true;
//		 
//	   return false;
//	}
	/**
	 * Why did they use this.numerator instead of just numerator? (same question for denominator)
	 */
}
