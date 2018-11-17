package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/** Just a Frame
 * @version $Id: JFrameDemo.java,v 1.16 2007/05/22 12:56:47 ian Exp $
 */
public class JFrameDemo extends JFrame {

	private static final long serialVersionUID = -3089466980388235513L;
	JButton quitButton;

	/** Construct the object including its GUI */
	public JFrameDemo() {
		super("JFrameDemo");
		Container cp = getContentPane();
		cp.add(quitButton = new JButton("Exit"));

		// Set up so that "Close" will exit the program, 
		// not just close the JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// This "action handler" will be explained later in the chapter.
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
			
		pack();
		setLocation(500, 400);
	}
	public static void main(String[] args) {
		new JFrameDemo().setVisible(true);
	}
}
