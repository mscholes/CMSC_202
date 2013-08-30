/**
 * Read and print data entered via command
 * line.
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version May 3, 2013
 *
 */
package lab02;

public class CommandArgs {

	/**
	 * Read and print name and age entered via
	 * command line.
	 * Precondition: None.
	 * Postcondition: None.
	 * @param 
	 * @return 
	 */
	public static void main(String[] args) {
		

/**
 *  Can't seem to get this to work because I need args to be readable for
 *  Scanner later. But if I establish it as a string in the main setup above,
 *  I can't convert it to readable below... I prolly don't understand the
 *  'Readable' function, but I need to move on so I'll just skip checking if
 *  there are 0 arguments provided.
 *  
 *  EDIT: Changed approach: now concatenating the array into a string for
 *  	  Scanner rather than making the array Readable. This means the
 *  	  following check for 0 args will work.
 */
		if (args.length < 3) {
			System.out.println("Proper usage is:\n"
							  + "java lab2.CommandArgs firstname lastname age");
			System.exit(0);
		}

/**
 * This seems contrived using a state field to determine if I should escape
 * the program. Is there a better way to invert the try/catch scheme to
 * catch when an exception is NOT thrown?
 */
		boolean intrptCtrl = false;
		for (String arg : args) {
			try {
				if (intrptCtrl == true) {
					System.out.print("!ERROR!\n  Enter age in word form");
					System.exit(0);
				}
				Float.valueOf(arg);
				intrptCtrl = true;
			} catch(NumberFormatException e) {
				intrptCtrl = false;
			}
		}
		// Necessary if the last arg is a number.
		if (intrptCtrl == true) {
			System.out.print("!ERROR!\n  Enter age in word form");
			System.exit(0);
		}
		
		String nameFirst = args[0];
		String nameLast  = args[1];
		String age		 = args[2];
		
		if (args.length>3) {
			for (int i = 3; i <= (args.length-1); i++){
				age = age + " " + args[i];
			}
		}
		
		System.out.println("You Entered:\n" + nameLast + ", " + nameFirst + ", " + age);
				
	}

}
