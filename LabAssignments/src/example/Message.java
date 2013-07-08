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

public class Message {
	public static final int MAX_MESSAGES = 100;
	
	private byte[] encodedMsg;
	private String msg;

	public Message(String template) {
		msg = template;
		encodedMsg = template.getBytes();
	}

	public Message(byte[] encodedMsg) {
		this.encodedMsg = encodedMsg;
		msg = new String(encodedMsg);
	}

	public byte[] getEncodedMsg() {
		return encodedMsg.clone();
	}

	public String getMsg() {
		return msg;
	}
	
	public void updateMsg(String newValue){
		msg = newValue;
		encodedMsg = msg.getBytes();
	}

	public static void main(String args[]) {
		String input = "This is my message: " + args[0];
		System.out.println(input);
		Message fromStr = new Message(input);
		byte[] messageEncoded = fromStr.getEncodedMsg();
		System.out.println(messageEncoded.toString());
		Message fromBytes = new Message(messageEncoded);
		System.out.println(fromBytes.getMsg());
		
		
		FakeSystem.FAKE_GLOBAL = "Bad practice";
	}
}