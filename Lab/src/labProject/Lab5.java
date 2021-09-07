package labProject;


import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

import static java.lang.Integer.*;


public class Lab5 {

	public static void main(String[] args) {
		
		String intx = JOptionPane.showInputDialog("skriv først tall:");
		
		 int a = parseInt(intx);
		 
		 String intx1 = JOptionPane.showInputDialog("skriv andre tall:");
			
		 int b = parseInt(intx1);
		 
		 String intx2 = JOptionPane.showInputDialog("skriv tredje tall:");
			
		 int c = parseInt(intx2);
		 
		 String d = null;
		 
		 if (a < b && a < c && b < c) 
			 
		    d = a + " "+ b + " " +c;
		 
		 
		 else if (b< a && b < c && a <c) 
			 
			   d = b + " "+ c + " " +a;
			 
			 
		 else if (c< a && c< b && b<a) 
			 
		 d = c + " "+ b + " " +a;
			 
			 
		 JOptionPane.showMessageDialog(null,"rekkefølgje:" + d);
	}
}
