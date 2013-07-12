package lab10;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class StudentDriver {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws IOException
	{		
		Scanner fileScanner = null;
		Student[] students;
		int numStudents = 0;

	/**
		//Step a: Perform number of arguments check 
		if ( Write condition here )
		{
			 Throw an appropriate exception here. 
		}
	*/
		
		
        /*Step b: Assign the file's input stream to the 
        Scanner object.
        */
		//check to see if the program was run with the command line argument
	    if(args.length < 1) {
	        System.out.println("Error, usage: java ClassName inputfile");
	        System.exit(1);
	    }
	    
		fileScanner = new Scanner(new FileInputStream(args[0]));
		

        /*Step c: Read the number of students from the file
         and store in numStudents 
        */
		numStudents = fileScanner.nextInt();
        System.out.println("The number of students is: " + numStudents);
        
        //Step to the next line in the input text file.
        fileScanner.nextLine();
        
        
        /*Step d: Allocate memory for students array based on 
        numStudents
        */
        students = new Student[numStudents];
        
        int i = 0;
        while (i < numStudents)
        {
            /*Step e: Read from the file line by line using the 
            Scanner object and store the values read in the 
            students array.
            */
        	if (i != 0)
            	fileScanner.nextLine();
        	
        	students[i] = new Student(fileScanner.next(), fileScanner.nextInt());
        	
        	i++;
        }
        
        
        /* Step f: close the file reader as you are done 
        reading the file
        */
        fileScanner.close();
        
        
        /*Step g: Print out the information read from the 
        file which is stored in students array in the form
        Student name = [name] and id = [id]
        */
        System.out.println(Arrays.toString(students));
        
        /*BONUS: Write printout to a text file*/
        FileWriter f = new FileWriter(new File("outfile.txt"));
        
        f.write("The number of students is: " + numStudents + "\r\n");
        f.write(Arrays.toString(students));
        f.close();
	}	
}
