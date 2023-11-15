import javax.swing.JOptionPane;
import java.lang.Math;
public class SolveEquation {

	public static void FirstDegreeEquation() {
		String aStr, bStr;
		double a = 1, b, result;
		//Input and check a
		do {
			if(a == 0 ) {
				JOptionPane.showMessageDialog(null, "Invalid a because a is different from 0!\n"
						+ "Please input a again.");
			}
			aStr = JOptionPane.showInputDialog(null,
					"Please input a: ","Input equation ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
			a = Double.parseDouble(aStr);
			
		} while (a == 0);
		//Input b
		bStr = JOptionPane.showInputDialog(null,
				"Please input b: ","Input equation ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
		b = Double.parseDouble(bStr);
		//Solve
		result = -b / a; 
		JOptionPane.showMessageDialog(null, "Solution of this problem : x = " + result,
				"Solve equation ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static void SystemoFirstDegreeEquation() {
		String aStr, bStr, cStr;
		double[] a = new double[2];
		double[] b = new double[2];
		double[] c = new double[2];
		double D, Dx, Dy, x, y;
		
		// Input the first equation
		//Input a1
		aStr = JOptionPane.showInputDialog(null,
				"Please input a: ","Input the first equation ax + by = c", JOptionPane.INFORMATION_MESSAGE);
		a[0] = Double.parseDouble(aStr);
		//Input b1
		bStr = JOptionPane.showInputDialog(null,
				"Please input b: ","Input the first equation ax + by = c", JOptionPane.INFORMATION_MESSAGE);
		b[0] = Double.parseDouble(bStr);
		//Input c1
		cStr = JOptionPane.showInputDialog(null,
				"Please input c: ","Input the first equation ax + by = c", JOptionPane.INFORMATION_MESSAGE);
		c[0] = Double.parseDouble(cStr);
		
		// Input the second equation
		//Input a2
		aStr = JOptionPane.showInputDialog(null,
				"Please input a: ","Input the second equation ax + by = c", JOptionPane.INFORMATION_MESSAGE);
		a[1] = Double.parseDouble(aStr);
		//Input b2
		bStr = JOptionPane.showInputDialog(null,
				"Please input b: ","Input the second equation ax + by = c", JOptionPane.INFORMATION_MESSAGE);
		b[1] = Double.parseDouble(bStr);
		//Input c2
		cStr = JOptionPane.showInputDialog(null,
				"Please input c: ","Input the second equation ax + by = c", JOptionPane.INFORMATION_MESSAGE);
		c[1] = Double.parseDouble(cStr);
		
		//Solve
		D = a[0]*b[1] - a[1]*b[0];
		Dx = c[0]*b[1] - c[1]*b[0];
		Dy = a[0]*c[1] - a[1]*c[0];
		
		if (D != 0) {
			x = Dx / D;
			y = Dy / D;
			JOptionPane.showMessageDialog(null, "Solution of this problem : (" + x + "," + y + ").",
					"Solve System of first-degree equation", JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null, 
				"This system of equations has infinitely many solutions or no solutions!",
				"Solve System of first-degree equation", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static void SecondDegreeEquation() {
		String aStr, bStr, cStr;
		double a = 1, b, c, delta;
		double result1, result2;
		//Input and check a
		do {
			if(a == 0 ) {
				JOptionPane.showMessageDialog(null, "Invalid a because a is different from 0!\n"
						+ "Please input a again.");
			}
			aStr = JOptionPane.showInputDialog(null,
					"Please input a: ","Input equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
			a = Double.parseDouble(aStr);
			
		} while (a == 0);
		//Input b
		bStr = JOptionPane.showInputDialog(null,
				"Please input b: ","Input equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
		b = Double.parseDouble(bStr);
		//Input c
		cStr = JOptionPane.showInputDialog(null,
				"Please input c: ","Input equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
		c = Double.parseDouble(cStr);
		//Solve
		delta = b*b - 4*a*c;
		if (delta > 0) {
			result1 = (-b - Math.sqrt(delta)) / 2*a;
			result2 = (-b + Math.sqrt(delta)) / 2*a;
			JOptionPane.showMessageDialog(null, "Solution of this problem : x1 = " + result1 + " and x2 = " + result2,
					"Solve equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (delta == 0) {
			result1 = -b / 2*a;
			JOptionPane.showMessageDialog(null, "Solution of this problem : x = " + result1,
					"Solve equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null, "This equation has no solution",
				"Solve equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static void main(String[] args) {
		String option;
		
		option = JOptionPane.showInputDialog(null,
				"Please select one of three programs: \n"
				+ "1. Solve the first-degree equation (linear equation) with one variable.\n"
				+ "2. Solve the system of first-degree equations (linear system) with two variables.\n"
				+ "3. Solve the second-degree equation with one variable.\n"
				+ "4. Exit program.\n", 
				"Menu programs", JOptionPane.INFORMATION_MESSAGE);
	
		// switch statement with string data type
		switch (option) {
		// Case
		case "1":
			FirstDegreeEquation();
			main(null);
			break;
		// Case
		case "2":
			SystemoFirstDegreeEquation();
			main(null);
			break;
		// Case
		case "3":
			SecondDegreeEquation();
			main(null);
			break;
		// Case
		case "4":
			JOptionPane.showMessageDialog(null, "Program is stopping!");
			System.exit(0);
		// Default case
		default:
			JOptionPane.showMessageDialog(null, "Invalid option! Please select again");
			main(null);
		}
	}
}