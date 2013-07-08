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

public class Apartment extends Residence {
	
	// int representing the story the apartment is on. 
	private int story;
	
	/**
	 * Constructs a new Apartment with the inherited constructor from
	 * Residence, including a provided number of rooms, a number of
	 * external walls, a boolean for whether or not there is a washer,
	 * and now what story the apartment is on.
	 * Precondition: number of rooms must be > 0
	 * Precondition: number of external walls must be >= 0
	 * Postcondition: None.
	 * @param r the number of rooms in the new Residence
	 * @param e the number of external walls on the new Residence
	 * @param w boolean for if there's a washer or not
	 * @return None
	 */
	protected Apartment(int story, boolean washer)
	{
		super(4, 4, washer);
		this.story = story;
	}
	
	protected int onStory(){
		return story;
	}
	
	protected double propertyValue(){
		if (this.hasWasher())
			return super.propertyValue() + 100;
		else
		{
			return super.propertyValue();
		}
	}
	
	public String toString(){
		String storyStr = "\nStory: " + this.onStory();
		return super.toString() + storyStr;
	}

}
