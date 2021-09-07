package labProject;

import java.lang.Math.*;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
import java.lang.Integer.*;


public class LabO2 {

	
	public static void main(String[] args) {
		
		String tex = JOptionPane.showInputDialog("skriv eit heil tal!");
	
		int tal = Integer.parseInt(tex);
		
		int tall = 1;
		
		for(int i = 1; i <= tal; i++ ){
			
			tall = tall * i;
		}

		 JOptionPane.showMessageDialog(null,tall);
	}
	
}
