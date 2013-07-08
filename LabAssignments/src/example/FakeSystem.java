/**
 * TODO Class description
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version Jun 30, 2013
 *
 */
package example;

public class FakeSystem {
	private Message currentErrorMsg = new Message("All systems nominal");
	public static String FAKE_GLOBAL;
	
	public void changeError(String errorText){
		//currentErrorMsg = new Message(errorText);
		currentErrorMsg.updateMsg(errorText);
		Message myMsg = new Message("Test");
	}
}
