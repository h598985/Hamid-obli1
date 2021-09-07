package labProject;

import javax.swing.JOptionPane;

import static java.lang.Integer.*;

import static java.lang.Math.*;

public class Lab1g {

	public static void main(String[] args){
		
		int inntekt0 = 164100;
		int inntekt1= 230950;
		int inntekt2= 580650;
		int inntekt3= 934050;
		
		String intx = JOptionPane.showInputDialog("skriv din inntekt:");
		
		int inntekt = parseInt(intx);
				
		if (inntekt <= inntekt0) {
			
		int nettoløn = inntekt0;
		
			JOptionPane.showMessageDialog(null, inntekt);	
		}

		else if(inntekt> inntekt0 && inntekt <= inntekt1 ) {
			
			double nettoløn = inntekt*0.9907;
			
			
			JOptionPane.showMessageDialog(null, "nettoløn: "+nettoløn);	
		}
		
		else if (inntekt> inntekt1 && inntekt <= inntekt2 ) {
			
           double nettoløn = inntekt*0.975;
			
			
			JOptionPane.showMessageDialog(null, "nettoløn: "+nettoløn);	
		}
		else if (inntekt> inntekt2 && inntekt <= inntekt3) {
			
            double nettoløn = inntekt*0.8848;
			
			
			JOptionPane.showMessageDialog(null,"nettoløn: "+ nettoløn);
		}
		
		else if (inntekt> inntekt3) {
			
			 double nettoløn = inntekt*0.8548;
				
				
				JOptionPane.showMessageDialog(null, "nettoløn: "+ nettoløn);
		}
	}
}
