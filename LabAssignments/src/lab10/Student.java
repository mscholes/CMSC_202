/**
 * TODO Class description
 * Class Invariants:
 * TODO invariants list
 * 
 * @author Matt Scholes <mscholes3@gmail.com>
 * @version Jul 11, 2013
 *
 */
package lab10;

public class Student {
	
	private String name;
	private Integer id;
	
	public Student(String name, Integer id){
		this.name = name;
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public Integer getID(){
		return id;
	}
	
	public String toString(){
		return "Student " +
				"name = " + name +
				" and id = " + id + "\r\n";
	}
}
