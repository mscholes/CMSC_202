/**
 * TODO Class description
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version Jul 7, 2013
 *
 */
package lab7;

public class Tent extends Residence {
	
	/**
	 * Constructs a new Tent with the inherited constructor from
	 * Residence, including a provided number of rooms, a number of
	 * external walls, and a boolean for whether or not there is a washer.
	 * Precondition: number of rooms must be > 0
	 * Precondition: number of external walls must be >= 0
	 * Postcondition: None.
	 * @param r the number of rooms in the new Residence
	 * @param e the number of external walls on the new Residence
	 * @param w boolean for if there's a washer or not
	 * @return None
	 */
	protected Tent()
	{
		super(1, 2, false);
	}
	
	/**
	 * Overrides the inherited property value to a value appropriate for a tent.
	 * Precondition: None.
	 * Postcondition: None.
	 * @param None
	 * @return double property value
	 */
	public double propertyValue()
	{
	   return 0;
	}
}
