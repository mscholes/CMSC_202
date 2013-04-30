package lab1;

public class Incrementer {

	/**
	 * This prints the a count from 0 to 2 and then 'Finished' to the console.
	 * Precondition: None.
	 * Postcondition: None.
	 * @param args
	 * @return string to console
	 */
	public static void main(String[] args) {
		
	    int i = 0;
	    while (i < 3) {
	        System.out.println(i);
	        i++;
	    }
	    
	    System.out.println("Finished");

	}

}
