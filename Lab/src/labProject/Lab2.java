package labProject;

import javax.swing.JOptionPane;

import static java.lang.Integer.*;

import static java.lang.Math.*;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String intx = JOptionPane.showInputDialog("skriv talkarakter:");
	
		int talkarakter = parseInt(intx);
		
		
		String karakter = null;
		
		
		
	 if(talkarakter<= 100 && talkarakter>=90) {
			talkarakter = 6;
		} else if (talkarakter <=89 && talkarakter>=80) {
			talkarakter=5;
		}
		else if (talkarakter <=79 && talkarakter>=60) {
			talkarakter=4;
		}
		else if (talkarakter <=59 && talkarakter>=50) {
			talkarakter=3;
		}
		
		else if (talkarakter <=49 && talkarakter>=40) {
			talkarakter=2;
		}
		else if (talkarakter <=39 && talkarakter>=0) {
			talkarakter=1;
		}
		
		
			
		
		switch (talkarakter) {
		case 6: karakter ="A"; break;
		case 5: karakter ="B"; break;
		case 4: karakter ="C"; break;
		case 3: karakter ="D"; break;
		case 2: karakter ="E"; break;
		case 1: karakter ="F"; break;
		default : karakter ="ugyldig svar";
		}
		
		JOptionPane.showMessageDialog(null,karakter);
	}

}
