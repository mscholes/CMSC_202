/**
 * Read and print data entered via console
 * and read via Scanner.
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version May 1, 2013
 *
 */
package lab02;

import java.util.Scanner;

public class ScannerInput {

	/**
	 * Read and print name and age entered via console
	 * and read via Scanner 
	 * Precondition: None.
	 * Postcondition: None.
	 * @param 
	 * @return 
	 */
	public static void main(String[] args) {
		

		String namePrompt = "Enter name (First Last): ";
		String agePrompt  = "Enter age (in words): ";
		String entryFdBak = "You Entered:\n";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print(namePrompt);
        String nameFirst = input.next();
        String nameLast  = input.nextLine();
        
        System.out.print(agePrompt);
        while (input.hasNextInt()
        		|| input.hasNextDouble()
        		|| input.hasNextFloat()) {
        	// intended to ensure that only a string is provided
        	// incidentally blocks number/string mixes with whitespace
        	// e.g., blocks: '17 asdf', doesn't block: '17asdf'
        	
        	// QUESTION Is this efficient (if not rigorous) type checking?
        	//          Seems like it prints the error over and over
        	//          at whatever frequency the while loop is reevaluated
        	//          until a proper input is provided. This would seem
        	//          rather inefficient in a larger system.
        	
        	System.out.print("!ERROR!\n  Enter age in word form: ");
        	input.nextLine();
        }
        String age   = input.nextLine();
        
        String entry = nameLast + ", " + nameFirst + ", " + age;
        System.out.print(entryFdBak + entry);
        // QUESTION Why is a space printed before the final line?
        // e.g., 
        //Enter name (First Last): Matt Scholes
        //Enter age (in words): twenty five
        //You Entered:
        // Scholes, Matt, twenty five
        
        input.close();

	}

}
