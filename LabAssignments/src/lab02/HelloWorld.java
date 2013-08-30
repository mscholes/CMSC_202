/**
 * TODO Class description
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version Apr 30, 2013
 *
 */
package lab02;

public class HelloWorld {

	/**
	 * TODO Method description
	 * Precondition: None.
	 * Postcondition: None.
	 * @param 
	 * @return 
	 */
	public static void main(String[] args) {

		//page 1 example 1
	    System.out.print("Hello world\n");
	    
	    //page 1 example 2
	    String outputText = "Hello world\n";
	    System.out.print(outputText);
	    
	    //page 1 example 3
	    String myName = "Travis";
	    int myAge = 22;
	    double myHeight = 6.0;
	 
	    System.out.println("Name: " + myName);
	    System.out.print("Age: " + myAge + "\n");
	    System.out.print("Height: ");
	    System.out.println(myHeight);
	    System.out.println("Name: " + myName + " Age: " + myAge + " Height: " + myHeight);
	    
	    int a = 4;
	    int b = 3;
	    System.out.println("Name: " + a + b);
	    
	    System.out.println(a + b + "Name: ");
	    
	    int i = 7;
	    float f = 962.5274f;
	    double d = 12345.6789;
	 
	    System.out.printf("There are %d dogs. \n", i);
	    System.out.printf("They can smell %2.1f times better than we can.\n", f);
	    System.out.printf("Actually, %10.1f is a made-up number. So is %f\n", f, d);
	    System.out.printf("Maybe in %e years, we will be able to smell as well as dogs.", d);
		
	}

}
