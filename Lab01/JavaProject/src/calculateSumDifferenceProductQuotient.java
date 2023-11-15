import javax.swing.JOptionPane;
public class calculateSumDifferenceProductQuotient {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strSum = "Sum of 2 double numbers which are entered: ";
		String strDifference = "Difference of 2 double numbers which are entered: ";
		String strProduct = "Product of 2 double numbers which are entered: ";
		String strQuotient = "Quotient of 2 double numbers which are entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		
		strSum += num1 + num2;
		strDifference += num1 - num2;
		strProduct += num1 * num2;
		
		JOptionPane.showMessageDialog(null, strSum, 
				"Dang Hai Mai Linh 20210529 -Show sum of 2 double numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strDifference, 
				"Dang Hai Mai Linh 20210529 -Show difference of 2 double numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strProduct, 
				"Dang Hai Mai Linh 20210529 -Show product of 2 double numbers", JOptionPane.INFORMATION_MESSAGE);
		//Check the divisor of the division
				if (num2 != 0) {
					strQuotient += num1 / num2;
				JOptionPane.showMessageDialog(null, strQuotient, 
				"Dang Hai Mai Linh 20210529 -Show quotient of 2 double numbers", JOptionPane.INFORMATION_MESSAGE);
				}
				else JOptionPane.showMessageDialog(null,
						"Division cannot be performed because the second number is 0!",
						"Dang Hai Mai Linh 20210529 - Calculation",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}