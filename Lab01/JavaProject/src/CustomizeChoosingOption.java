import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomizeChoosingOption {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		String[] options = new String[2];
		options[0] = "I do";
		options[1] = "I don't";
		int option = JOptionPane.showOptionDialog(frame.getContentPane(), 
				"Do you want to change to the first class ticket?", "Message", 0, 
				JOptionPane.INFORMATION_MESSAGE, null, options, null);
		
		JOptionPane.showMessageDialog(null, 
				"You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
		
		System.exit(0);
	}
}