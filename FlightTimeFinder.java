import javax.swing.JOptionPane;

public class FlightTimeFinder {

	public static void main(String[] args) {

		double a = (.5*-9.8);	
		String input = JOptionPane.showInputDialog("Please input an initial height (meters):");
		double c = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Please input an initial velocity (meters per second):");
		double b = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Please input an target height (meters):");
		double h = Double.parseDouble(input);
		
		Roots(a,b,c,h);
			
		}
		
		public static void Roots(double a, double b, double c, double h) {
		
			if (h > 0) {
				c = c-h;
			} else if (h < 0) {
				c = c+h;
			} else {
				
			}
			
			double disc = ((b*b) - 4*a*c); 
			
			//If no real roots, end program. Else, calculate and display roots.
			if (disc < 0) {
				JOptionPane.showMessageDialog(null, "This equation does not have real roots. Now exiting program.");
				System.exit(1);
			} else {
			
				double r1 = ((-b + Math.sqrt(disc))/(2.0*a));
				double r2 = ((-b - Math.sqrt(disc))/(2.0*a));
				double flightTime;
				if (r1 < 0) {
					flightTime = r2;
				}
				else {
					flightTime = r1;
				}
			
				JOptionPane.showMessageDialog(null, "The flight time to height " + h + " is: " + flightTime + " second(s).");
			}
		}


}
