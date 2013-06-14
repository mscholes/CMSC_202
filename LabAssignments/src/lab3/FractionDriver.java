package lab3;

import java.util.Scanner;


/**
 * FractionDriver.java - driver to test the Fraction class.
 * @version
 * @author
 * @Lab CMSC 202 - Spring 2012
 * @section
 */

public class FractionDriver {

	/**
	 * Driver to test the Fraction class.
	 * Precondition: None
	 * Postcondition: None
	 * @param: radius args Command-line arguments
	 * @return: None
	 */
	public static void main(String[] args) {
		
        //Create a Scanner object on System.in
        Scanner scanner = new Scanner(System.in);
        
/** Why do w initialize to 1?
 */
        int numerator = 1;
        int denominator = 1;
           
        //Use the Scanner object to get the numerator and denominator of the first fraction
        System.out.println("Enter the numerator of the first fraction ");
        numerator = scanner.nextInt();
        System.out.println("Enter the denominator of the first fraction ");
        denominator = scanner.nextInt();          
         
        //Create the first fraction object with input provided and print by invoking toString()
        Fraction firstFraction = new Fraction(numerator, denominator);
        System.out.println("The first fraction is:" + firstFraction.toString());
         
        //Create and print the reciprocal of the first fraction
        Fraction reciprocalFirstFraction = new Fraction(denominator, numerator);
        System.out.println("The reciprocal of first fraction is:" + reciprocalFirstFraction);
/** Where does it get the '/' for this print?
 * Before we used
 * 		"The first fraction is " + firstFraction.toString()
 * where our home-rolled 'toString' method gave it a '/'.
 * 
 * I have a thought based upon 2 things:
 * 1) I'm getting a note in the Fraction class that our home-rolled 'toString()' method overrides
 *    'java.lang.Object.toString' which I guess means that java defaults to our home-rolled method
 *    for 'toString()' calls.
 * 2) I guess java may be interpreting the object 'reciprocalFirstFraction' argument in the 
 *    'println' call as a string and automatically calls a 'toString' method to cast to match the string context.
 * 
 * With these 2 postulates, the program flow follows:
 * 1) java sees 'reciprocalFirstFraction' in a string context 
 * 2) Calls a 'toString()' method to cast to string
 * 3) notes that the object 'reciprocalFirstFraction' was instantiated (use?) by the class Fraction
 * 4) notes that the class Fraction has an overriding 'toString()' method
 * 5) our 'toString()' method returns a string of the form 'num/den'
 * 
 * Questions assuming this is correct:
 * 1) Why did we call the 'toString()' method explicitly in the 'println' call for 'firstFraction'?
 * 		- If this is just for instructional clarity, that's fine; I just want to make sure I understand
 * 		  what's going on.
 * 2) What would happen if we hadn't home-rolled a 'toString()' method?
 * 		- I note that if I comment-out our 'toString()' method the following results:
 * 			a) The first fraction is lab3.Fraction@1fbebee
 * 			b) The reciprocal of first fraction is lab3.Fraction@3e584d
 * 		- I don't know how to interpret this result.
 * 		- Does this imply that all objects that expect to return a string at some point should
 * 		  implement their own 'toString()'?
 * 		- I'm having trouble separating pedagogical aids with practical advice. This whole lab
 * 		  we are creating a program that creates, represents, and modifies fractions, something
 * 		  it seems the core language handles and not a task I'd expect I'd use my own implementation
 * 		  in future classes that use fractions. So I don't know if the part where they have us
 * 		  make a 'toString()' method is the same.
 */
         
        //Use the Scanner object to get the numerator and denominator of the second fraction
        System.out.println("Enter the numerator of the second fraction ");
        numerator = scanner.nextInt();
        System.out.println("Enter the denominator of the second fraction ");
        denominator = scanner.nextInt();
           
        //Create the second fraction object with input provided and print by invoking toString()
        Fraction secondFraction = new Fraction(numerator, denominator);
        System.out.println("The Second Fraction is:" + secondFraction.toString());
  
        //Create and print the reciprocal of the second fraction
        Fraction reciprocalSecondFraction = new Fraction(denominator, numerator);
        System.out.println("The reciprocal of the second fraction is:" +
                reciprocalSecondFraction);
        
        
        
        //Print the decimal value of the two fractions by invoking decimalValue()
        System.out.printf("The decimal value of the first fraction is %.2f\n",
                firstFraction.decimalValue());
        System.out.printf("The decimal value of the second fraction is %.2f\n",
                secondFraction.decimalValue());
        
        
        
        // !!!!BONUS!!!! Print the reduced value of the two fractions by invoking reduce()
        System.out.println("The reduced first fraction is:" +
        		firstFraction.reduce());
        System.out.println("The reduced second fraction is:" +
        		secondFraction.reduce());
        
        
        
        //Print the product of the fractions by invoking multiply()
        System.out.println("The product of the two fractions is:" +
        		firstFraction.multiply(secondFraction).toString());
        System.out.println("which reduced is:" +
        		firstFraction.multiply(secondFraction).reduce());

/**
 * Ok now I'm very confused. What is the way that you pass variable in this language?? The following
 * is opaque to me:
 * 
 * 		firstFraction.multiply(secondFraction).toString())
 * 
 * So 2 methods are being called here:
 * 	1) 'multiply()' is being called on the 'firstFraction' object with 'secondFraction' as an argument.
 * 			- instance variables 'numerator' and 'denominator' for 'firstFraction' are passed using:
 * 					firstFraction.multiply()
 * 			- instance variables 'numerator' and 'denominator' for 'secondFraction are passed using:
 * 					multiply(secondFraction)
 * 			- ?Why not use:
 * 					multiply(firstFraction secondFraction)
 * 				-- This actually looks more right based upon our method definition:
 * 						public Fraction multiply( Fraction otherFraction )
 * 				-- I see 2 arguments here: 'Fraction' and 'otherFraction'
 * 		!!!EDIT!!!: After looking back at the main() method we used in a previous lab, I see that
 * 					'Fraction' the argument is not an argument but typecasting. I bet arguments
 * 					are delimited by commas not spaces.
 * 			
 *  2) toString() is being called on the resultant object of the first call.
 *  		- this raises 2 questions
 *  			i)  Why isn't this\can this be written like:
 *  					toString(firstFraction secondFraction)
 *  	!!!EDIT!!!: My realization noted above after looking at main() may answer this question.
 *  			ii) Is a new object being created from the multiply() class
 *  					-or-
 *  				are we modifying the state of the 'firstFraction' object
 *  					-or-
 *  				something else?
 *  				-- I can't see how it's the 1st since we aren't calling the new() class,
 *  				   currently my only internal indicator that a new object is being instantiated.
 *  				-- The 2nd seems unlikely for reasons I can't entirely vocalize.
 *  				-- In an extreme exercise in tautology, I know not what the 3rd is.
 *  	!!!EDIT!!!: Rereading of the notes in the lab it looks like they *do* want us to create a
 *  				new object inside the method. I think this means that the driver doesn't see
 *  				this new object outside the context of this method call.
 */    

        //Print whether or not the fractions are equivalent by invoking equals()
        System.out.println("Are these fractions equivalent? " +
                firstFraction.equals(secondFraction));

	}

}
