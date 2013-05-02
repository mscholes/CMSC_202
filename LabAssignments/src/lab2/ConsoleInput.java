/**
 * TODO Class description
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version May 1, 2013
 *
 */
package lab2;

import java.util.Scanner;

public class ConsoleInput {

	/**
	 * TODO Method description
	 * Precondition: None.
	 * Postcondition: None.
	 * @param 
	 * @return 
	 */
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        //Read in token as double
        double d1 = input.nextDouble();
        //Read in token as int
        int    i1 = input.nextInt();
        //Read in token as string
        String s1 = input.next();
        String s2 = input.next();
 
        //Print the tokens out
        System.out.println("i1 is " + i1);
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        
	}

}
