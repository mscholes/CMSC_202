package lab7;

public class ResidenceDriver 
{
	public static void main(String[] args) 
        {
		
			//Test Residence class
    		System.out.println("Test Residence:");
			Residence testResidence = new Residence(3,2,true);
			System.out.println(testResidence.toString());
		
        	System.out.println("\nHouse:");
			House testHouse = new House();
			System.out.println(testHouse.toString());
			
			System.out.println("\n\nTent:");
			Tent testTent = new Tent();
			System.out.println(testTent.toString());
	
			System.out.println("\n\nApartment:");
			Apartment testApartment = new Apartment(5, true);
			System.out.println(testApartment.toString());
	
	}

}
