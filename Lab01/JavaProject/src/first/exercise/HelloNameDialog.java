//Example 3: HelloNameDialog.java
package first.exercise;

import javax.swing.JOptionPane;
public class HelloNameDialog {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "I'm Dang Hai Mai Linh 20210529. Hi " + result + " !");
		System.exit(0);
	}
}