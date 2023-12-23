package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {
	private Media media;
	private JButton btnAddToCart, btnPlay;
	
	public MediaStore(Media media) {
		ButtonListener btnListener = new ButtonListener();
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		btnAddToCart = new JButton("Add to cart");
		container.add(btnAddToCart);
		btnAddToCart.addActionListener(btnListener);
		if(media instanceof Playable) {
			btnPlay = new JButton("Play");
			container.add(btnPlay);
			btnPlay.addActionListener(btnListener);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		
	}
	public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if(button.charAt(0) == 'A') {
            	
                JFrame frame = new JFrame("JOptionPane ");
                JOptionPane.showMessageDialog(frame,
                        "The media has been added",
                        "Add To Cart",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if (button.charAt(0) == 'P') {
                JFrame frame = new JFrame("JOptionPane ");
                JOptionPane.showMessageDialog(frame,
                        "Play The Media",
                        "Play",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
