/**
 * Class that creates the basic foundation for a Residence object.
 * This includes the number of rooms, number of external walls, 
 * whether there is a washer included in the residence.
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version Jun 30, 2013
 *
 */
package lab7;

public class Residence {
	
	
	// int representing the number of rooms and 
	// number of external walls of the Residence.
	private int rooms;
	private int extWalls;
	
	// boolean representing the washer carrying state of the Residence.
	private boolean washer;
	
	/**
	 * Constructs a new Residence with a provided number of rooms, number of
	 * external walls, and a boolean for whether or not there is a washer.
	 * Precondition: number of rooms must be > 0
	 * Precondition: number of external walls must be >= 0
	 * Postcondition: None.
	 * @param r the number of rooms in the new Residence
	 * @param e the number of external walls on the new Residence
	 * @param w boolean for if there's a washer or not
	 * @return None
	 */
	protected Residence( int rooms, int extWalls, boolean washer )
	{
		//Precondition #1 & #2: number of rooms > 0, number of external walls >= 0
		if ((rooms <= 0) || (extWalls < 0))
			throw new RuntimeException("Residence must have at least 1 room and" +
					"a non-negative number of external walls.");
		else
		{
			this.rooms     = rooms;
			this.extWalls  = extWalls;
			this.washer    = washer;
		}
	}
	
	/**
	 * Returns whether or not there is a washer in the residence
	 * Precondition: None.
	 * Postcondition: None.
	 * @param ???
	 * @return boolean washer or no?
	 */
	protected boolean hasWasher(){
		return washer;
	}
	
	/**
	 * Calculates the property value based on number of rooms * 10000.
	 * Precondition: None.
	 * Postcondition: None.
	 * @param None
	 * @return double property value
	 */
	protected double propertyValue(){
		return rooms * 10000;
	}
	
	/**
	 * Calculates the number of windows based on the number of external walls * 2.
	 * Precondition: None.
	 * Postcondition: None.
	 * @param None
	 * @return double property value
	 */
	protected int numWindows(){
		return extWalls * 2;
	}
	
	public String toString(){
		String roomsStr = "Number of Rooms: " + rooms + "\n";
		String wallsStr = "Number of External Walls: " + extWalls + "\n";
		String hasWashr = "Washer: " + this.hasWasher() + "\n";
		String windsStr = "Number of Windows: " + this.numWindows() + "\n";
		String prpVaStr = "Property Value: " + this.propertyValue();
		
		return roomsStr + wallsStr + hasWashr + windsStr + prpVaStr;
	}
	
	
	
}
