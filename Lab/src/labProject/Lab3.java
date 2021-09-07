package labProject;

import javax.swing.JOptionPane;

import static java.lang.Integer.*;

import static java.lang.Math.*;

import javax.swing.JOptionPane;

public class Lab3 {

	public static void main(String[] args) {
		
		
		
		String karakter = null;
		
		
		
		
	
	 for(int i = 0; i <= 10; i++) {
		
	String intx = JOptionPane.showInputDialog( (10-i)+ " studentar igjen");
	
	int talkarakter = parseInt(intx);
	if (talkarakter>100 || talkarakter <0) {
		
		i--;
		 JOptionPane.showMessageDialog(null,"Du har tatsta feil tal, prøv igjen");
	}
	else {
		

		 if(talkarakter<= 100 && talkarakter>=90) {
			     karakter = "A";
			} else if (talkarakter <=89 && talkarakter>=80) {
				 karakter = "B";
			}
			else if (talkarakter <=79 && talkarakter>=60) {
				 karakter = "C";
			}
			else if (talkarakter <=59 && talkarakter>=50) {
				 karakter = "D";
			}
			
			else if (talkarakter <=49 && talkarakter>=40) {
				 karakter = "E";
			}
			else if (talkarakter <=39 && talkarakter>=0) {
			     karakter = "F";
			}
			 else if (talkarakter < 0 || talkarakter>100){
			    	 karakter = "ugyldig svar";
			     }
		 JOptionPane.showMessageDialog(null,"din karakter:"+karakter);
	}
		 
		
			}
			
	 }

	}

	

