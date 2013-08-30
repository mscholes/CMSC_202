package lab12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class ScribbleDriver
{
	//Your application window
	private static JFrame frame;
	
	//Where you can draw stuff
	private static JPanel canvas;
	
	//Where your pen colour changing buttons will reside
	private static JPanel colorPalette;
	
	//Your default pen color. You will change this when different pen colour buttons are clicked.
	private static Color currentColor = Color.BLACK;
	
	//The last recorded x,y positions of your mouse
	private static int lastMouseX, lastMouseY;
	
	public static void createAndShowGUI()
	{
	    //Step 1:
		//a. Create the window with the title you want and set this to the JFrame frame.
		//b. Give your window a preferred size using methods provided by JFrame
		

		//Step 2a:
		//a. Make a JPanel for your canvas
		//b. Give your canvas a preferred size
		//c. Set your canvas's background colour
		//d. Add your canvas JPanel to your JFrame window
		
		//Step 2b:
		//a. Make the JPanel to hold the colour palette
		//b. Add your colour palette JPanel to your window
		
		//Step 3:
		//a. Make each of your pen colour buttons
		//b. Then add it to your palette JPanel
		
		//add event listener for mouse clicks to the JFrame
		frame.addMouseListener
		(
			new MouseAdapter()
			{
				public void mousePressed(MouseEvent e)
				{
				    //Step 4:
					//get the last positions of your mouse cursor
				}
			}
		);
		
		//add event listener for mouse movement to the JFrame
		frame.addMouseMotionListener
		(
			new MouseMotionAdapter()
			{
				public void mouseDragged(MouseEvent e)
				{
				    //Step 5:
					//a. get the JFrame's graphics context
					//b. get the current mouse cursor's position
					//c. set the graphics context's drawing color to your current pen color
					//d. using the graphics context's "pen", draw a line from your last mouse position to your current one
					//e. then set your last position to your current one
				}
		    }
		);
		
		//Step 6: Add action listeners to each of your color buttons
		// someButton.addActionListener
		// (
			// new ActionListener()
			// {
				// public void actionPerformed(ActionEvent e) 
				// {  
					// set pen colour
				// }
			// }
		// );
		
		//Step 7: Display the window. Simply uncommenting the code below
		//frame.pack();
		//frame.setVisible(true);
	 }

	 //Don't worry about this, it works.
	    public static void main(String[] args) 
	    {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater
	        (
	        	new Runnable() 
	        	{
	        		public void run() 
	        		{
	        			createAndShowGUI();
	        		}
	        	}
	        );
	   }
}
